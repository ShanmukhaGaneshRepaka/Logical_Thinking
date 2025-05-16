package com.dsa.stringchallanges;

import java.sql.SQLOutput;
import java.util.Locale;

public class OccurancesOfCharacter {

    static int countOccurrences(String s,char target)
    {

int occurences=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==target){
                occurences++;
            }
        }

        return occurences;//Todo
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("Ganeshgagagg",'G'));
    }
}
