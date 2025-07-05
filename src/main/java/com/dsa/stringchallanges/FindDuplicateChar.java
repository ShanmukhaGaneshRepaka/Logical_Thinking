package com.dsa.stringchallanges;

import java.util.*;

public class FindDuplicateChar
{
static char checkDupe(String s)
{
    for (int i = 0; i <s.length() ; i++) {
        for (int j = i+1; j <s.length() ; j++) {
            if(s.charAt(i)==s.charAt(j)){
                return s.charAt(i);
            }
        }
    }


    return ' ';
}
    static char findDuplicateChar(String s)
    {
        HashMap<Character,Integer> freqMap=new LinkedHashMap<>();
        for (int i = 0; i <s.length() ; i++) {

           freqMap.put(s.charAt(i),freqMap.getOrDefault(s.charAt(i),0)+1);
int count=0;
           if(freqMap.get(s.charAt(i))>1)
           {
               if(s.charAt(i)>1){
                   count++;
               }
               if(count==2)
               return s.charAt(i);
           }
        }


        return ' ';//No duplicate found
    }

    static Character checkDuplicate(String s)
    {

       Set<Character> set = new LinkedHashSet<>();

       for(char c:s.toCharArray())
       {
          /* if(!set.add(c))
           {
               return c;
           }*/

           if(set.contains(c))
           {
               return c;
           }
           else{
               set.add(c);
           }
       }
       return null;
    }
    public static void main(String[] args) {
       System.out.println(findDuplicateChar("GanesGhG"));
      //  System.out.println(checkDuplicate("BaanBana"));
    }
}
