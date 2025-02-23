package com.abis.learner;

import java.util.Arrays;

public class ReverseString {
    public String reverseString(String str)
    {
        char[] ch=str.toCharArray() ;
        int left=0;
        int right=ch.length-1;
        while(left<right)
        {
            char temp= ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

            // Increment from left side and decrement from right
            left++;
            right--;
        }
        return new String(ch);

    }
}