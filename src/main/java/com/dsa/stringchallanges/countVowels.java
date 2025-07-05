package com.dsa.stringchallanges;

public class countVowels {

    static int checkOwels(String s)
    {
        int count=0;
        for(char c:s.toLowerCase().toCharArray())
        {
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        System.out.println(checkOwels("AGanesh"));
    }
}
