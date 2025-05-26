package com.dsa.Matrix;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RotateMatrixOptimal {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        int ans[][] =   rotate(arr);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(Arrays.toString(ans[i]));

        }
    }
    static int[][] rotate(int[][] arr)
    {

        for (int i = 0; i <arr.length ; i++) {

                 for(int j=i+1; j <arr.length ; j++) {
                if(i==j) continue;

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
for(int i=0;i<arr.length;i++)
{
    reverse(arr[i]);
}


        return arr;
    }
   static void reverse(int[] arr)
    {
        int start = 0;int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;

        }
    }

}
