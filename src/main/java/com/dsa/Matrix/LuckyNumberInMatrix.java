package com.dsa.Matrix;
import java.util.*;
public class LuckyNumberInMatrix {
    public static void main(String[] args) {
      int[][] arr = {
              {7,12,13},{4,5,6},{3,2,3}
      };
      display(arr);
    }
    static void display(int[][] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {

            //Getting minimum element from row
            int min=0;
            for (int j = 1; j <arr[i].length ; j++) {
                if(arr[i][j]<arr[i][min])
                {
                 min = j;
                }
            }

            //checking maximum element for corresponding column
            int max = arr[i][min];
            boolean flag = true;
            for (int j = 0; j <arr[i].length ; j++) {
                 if(max<arr[j][i])
                 {
                     flag=false;
                 }
            }
            if(flag)
            {
                list.add(max);
            }
        }
        System.out.println(list);
    }
}
