package com.company;
import java.io.*;
import java.util.*;

public class lexicographical_small {

    static String chooseandswap(String string)
    {
        StringBuilder builder = new StringBuilder(string);
        boolean flag = false;
        char rep1=' ',rep2 = ' ';
        for(int i = 0; i < string.length()-1; i++)
        {
            if(flag) {
                builder.setCharAt(i, rep2);
            }
            if(!flag) {
                if (string.charAt(i) < string.charAt(0)) {
                    rep1 = string.charAt(i);
                    rep2 = string.charAt(0);
                    System.out.println(rep2 + " " + i);
                    flag = true;
                    for(int j = i-1; j >= 0; j--)
                    {
                        builder.setCharAt(j, rep1);
                    }
                    i--;
                    //System.out.println(builder);
                }
            }

        }
        return builder.toString();
    }


    public static void main(String [] args){
        String str = "";
        chooseandswap(str);
    }
}
