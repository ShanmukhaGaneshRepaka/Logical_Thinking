package com.dsa.stringchallanges;

public class convertStringTitleCase {
    public static void main(String[] args) {
        System.out.println(toTitleCase("my name is shanmukha ganesh"));
    }
    static String toTitleCase(String s)
    {

        String[]  arr=s.split(" ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);


        }

      /*  for(String c:arr)
        {
            Character.toUpperCase(c.charAt(0));
        }*/

        return  String.join(" ", arr);
    }
}
