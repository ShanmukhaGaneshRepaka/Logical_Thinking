package com.dsa.stringchallanges;

import java.util.*;

public class FindDuplicateChar
{

    static char findDuplicateChar(String s)
    {
        HashMap<Character,Integer> freqMap=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {

           freqMap.put(s.charAt(i),freqMap.getOrDefault(s.charAt(i),0)+1);

           if(freqMap.get(s.charAt(i))>1)
           {
               return s.charAt(i);
           }
        }


        return ' ';//No duplicate found
    }

    static String checkDuplicate(String s)
    {

        Set<Character> set=new LinkedHashSet<>();

        for(char c:s.toCharArray())
        {
           if(!set.contains(c)){
               set.add(c);

           }

        }
        StringBuilder sb=new StringBuilder();

        for(char c:set)
        {
         sb.append(c);
        }


        return sb.toString();
    }
    public static void main(String[] args) {
      //  System.out.println(findDuplicateChar("GaneshG"));
        System.out.println(checkDuplicate("Banana"));
    }
}
