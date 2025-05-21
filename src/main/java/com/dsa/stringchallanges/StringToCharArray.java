package com.dsa.stringchallanges;

import java.util.Arrays;

public class StringToCharArray {

static char[] conversionTocharArray(String s)
{
    char[] chars =new char[s.length()];
    for (int i = 0; i <s.length() ; i++) {
        chars[i]=s.charAt(i);
    }
    return chars;
}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(conversionTocharArray("Ganesh")));
    }

}
