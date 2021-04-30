package com.company;

public class sample {

    static String longestPalin(String string)
    {
        int lenght = string.length();
        //System.out.println(lenght);
        int table[][] = new int[lenght][lenght];

        int j=0;
        for(int i=0; i < lenght;i++)
        {
            table[i][j] = 1;
            j++;
        }
        int start = 0;
        int sub_length = 0;
        for(int i=0; i < lenght-1;i++)
        {
            if(string.charAt(i) == string.charAt(i+1))
            {
                table[i][i+1] = 1;
                sub_length = 2;
            }
        }
        int end = 0;
        int endPoint = 0;
        for(int k=3; k <= lenght; k++)
        {
            end = k-1;
            for(int i=0; i < lenght-k+1;i++)
            {
                if(string.charAt(i) == string.charAt(end))
                {
                    if(table[i+1][end-1] == 1)
                    {
                        table[i][end] = 1;
                        if(k > sub_length)
                        {
                            sub_length = k;
                            start = i;
                        }
                    }
                }
                end++;
            }
        }
        System.out.println(string.substring(start, start+sub_length));
        return string.substring(start, start+sub_length);
    }


    public static void main(String[] args)
    {
        String str = "abc";
        System.out.println(longestPalin(str));
    }
}
