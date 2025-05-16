package com.dsa.stringchallanges;

public class LongestWordinaSentence {
    public static void main(String[] args) {
        System.out.println(longestInaSentence("what is your name"));
    }
    static String longestInaSentence(String s)
    { String len=" ";
        String[] arr=s.split(" ");
        int maxLengthWord=Integer.MIN_VALUE;

        for(String s1:arr)
        {
            if(s1.length()>maxLengthWord){
                maxLengthWord=s1.length();
                len=s1;
            }
        }

        return len;
    }
}
