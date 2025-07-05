package com.dsa.stringchallanges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {

    boolean checkAnagrams(String s1,String s2)
    {

        if(s1.length()!=s2.length()) return false;

        Map<Character,Integer> freq=new HashMap<>();

        for (int i = 0; i <s1.length() ; i++) {
          freq.put(s1.charAt(i),freq.getOrDefault(s1.charAt(i),0)+1);
        }

        for (int j = 0; j <s2.length() ; j++) {
            char ch=s2.charAt(j);
           // if(!freq.containsKey(s2.charAt(j)))return false;

            if (!freq.containsKey(ch) || freq.get(ch) == 0) {
                return false;
            }

            // Decrease the frequency count of the character
            freq.put(ch, freq.get(ch) - 1);
           // freq.put(freq.getOrDefault(s2.charAt(j), -1));
            //freq.put(freq.getOrDefault(s2.charAt(j),-1));
        }


        return true;
    }
}
