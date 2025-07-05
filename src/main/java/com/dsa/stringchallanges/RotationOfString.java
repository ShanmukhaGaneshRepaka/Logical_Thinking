package com.dsa.stringchallanges;

public class RotationOfString {

    public static void main(String[] args) {
        System.out.println(checkRotation("Ganesh","aneshG"));
    }
    static boolean checkRotation(String s1,String s2)
    {
        if(s1.length()!=s2.length())return false;
        String concataned =s1+s1;

        return concataned.contains(s2);
    }
}
