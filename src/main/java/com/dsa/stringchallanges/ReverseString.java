package com.dsa.stringchallanges;
import java.lang.StringBuilder;
import java.util.Arrays;

public class ReverseString {

    static String reverseString(String s)
    {


        //Using Two pointers
        char[] arr=s.toCharArray();

       int start=0;
       int end=arr.length-1;
       while(start<end)
       {
           swap(arr,start,end);
           start++;
           end--;
       }


        //System.out.println();
        return new String(arr);
    }

    private static String reverseString1(String s) {
        //This method 1 using string Builder
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return sb.toString();
    }

    static  void swap(char [] arr,int i,int j)
    {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String[] args) {
        System.out.println(reverseString("Ganeshr"));

        System.out.println(reverseString1("Ganeshr"));
    }
}

