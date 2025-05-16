package com.dsa.stringchallanges;

public class CheckStringContainsOnlyDigits {
    public static void main(String[] args) {
        System.out.println(checkOnlyDigits("456g8"));
    }
    static boolean checkOnlyDigits(String s)
    {
        for(char c:s.toCharArray())
        {
                if(!Character.isDigit(c)) return false;
        }

        return true;
    }
}
