package com.dsa.stringchallanges;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
   /* static Character nonRepeatedChar(String s)
    {

        for (int i = 0; i <s.length() ; i++) {
            int count=1;
         char ch=s.charAt(i);
            for (int j = i+1; j <s.length(); j++) {
                if(ch==s.charAt(j)){
                    count++;
                }
            }
            if(count==1)return ch;
        }


      return null;
    }*/
static Character nonRepeatedCharUsingMap(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

       /* for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }*/

        for(char c:map.keySet()){
            if(map.get(c)==1){
                return c;
            }
        }
        return null;
}
    public static void main(String[] args) {
        System.out.println(nonRepeatedCharUsingMap("GaneshGa"));
    }
}
