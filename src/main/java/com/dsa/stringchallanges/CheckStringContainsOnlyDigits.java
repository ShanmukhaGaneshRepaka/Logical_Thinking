package com.dsa.stringchallanges;

public class CheckStringContainsOnlyDigits {
    public static void main(String[] args) {
        System.out.println(checkOnlyDigits("456"));
    }
    static boolean checkOnlyDigits(String s)
    {
        /*for(char c:s.toCharArray())
        {

                if(!Character.isDigit(c)) return false;
        }*/
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }

        return true;
    }
}
