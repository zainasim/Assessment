package com.company;

public class Largest_num {

    static StringBuffer finalbuffer = new StringBuffer();
    public static void printLargest(int[] arr) {
        Integer num1, num2;
        for (int i = 0; i <= arr.length-1; i++) {
            num1 = new Integer(arr[i]);
            if(i==0) {
                num2 = new Integer(arr[i + 1]);
                num1.toString();
                num2.toString();
                finalbuffer.append(num1);
                Compare(num2);
                i++;
            }
            else {
                Compare(num1);
            }
        }
        System.out.println(finalbuffer);
    }
    public static void Compare(Integer str2)
    {
        StringBuffer tempbuffer = new StringBuffer();
        tempbuffer.append(str2).append(finalbuffer.toString());
        finalbuffer.append(str2);
        if(finalbuffer.toString().compareTo(tempbuffer.toString()) < 0) {
            finalbuffer = tempbuffer;
        }
    }

    public static void main(String [] args){
        int[] arr = {54, 546, 548, 60};
        printLargest(arr);
    }
}
