package com.dsa.stringchallanges;

import static com.dsa.stringchallanges.ReverseString.swap;

public class PalindromeCheck {

    static boolean palindromeCheck(String s )
    {

        String sb= new StringBuilder(s).reverse().toString();


        return sb.equals(s);
    }

    static boolean palindromeCheck2(String s)
    {
        String temp=s;
        char[] arr = s.toCharArray();

        int start=0;int end=s.length()-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;end--;


        }
        String reversedString=new String(arr);

        return reversedString.equals(temp);
    }
    public static void main(String[] args) {
        System.out.println(palindromeCheck2("GaneshsenaG"));
    }
}
