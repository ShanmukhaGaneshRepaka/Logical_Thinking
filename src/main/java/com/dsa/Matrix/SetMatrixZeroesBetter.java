package com.dsa.Matrix;

import java.util.Arrays;

public class SetMatrixZeroesBetter {
    public static void main(String[] args) {
        int[][] nums={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};

        int[][] ans= setMatrixZeroes(nums);

        for(int i=0;i< ans.length;i++)
        {
            System.out.println(Arrays.toString(nums[i]));
        }

    }
    static int[][] setMatrixZeroes(int[][] arr)
    {
        boolean[] rows=new boolean[arr.length];
        boolean[] cols=new boolean[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==0)
                {
                    //Mark that row and column should be zero
                    rows[i]=true;
                    cols[i]=true;
                }
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(rows[i] || cols[j])
                {
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}
