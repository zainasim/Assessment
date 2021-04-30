package com.company;

import java.util.*;

public class Maximum_meeting {

    static int maxMeeting(int[] s, int[] f)
    {
        sort(f, 0, (f.length-1));
        int length = f.length;
        int count=1;
        int j=0;
        for(int i=1; i < length; i++)
        {
            if(s[i] > f[j])
            {
                count = count + 1;
                j=i;
            }
        }
        return count;
    }
    static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void main(String [] args){
        int S[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
        int F[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252};

        maxMeeting(S, F);
    }
}
