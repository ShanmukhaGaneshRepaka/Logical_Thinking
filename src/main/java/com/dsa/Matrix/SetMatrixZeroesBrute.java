package com.dsa.Matrix;

import java.util.Arrays;

public class SetMatrixZeroesBrute {
    public static void main(String[] args) {

        int[][] nums={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};

       int[][] ans= setMatrxZeros(nums);

       for(int i=0;i< ans.length;i++)
       {
           System.out.println(Arrays.toString(nums[i]));
       }
    }
    static int[][] setMatrxZeros(int[][] nums)
    {

        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]==0)
                {
                    //set row =0
                    for(int k=0;k<nums[i].length;k++){
                        if(nums[i][k]!=0) nums[i][k]=-1;
                    }
                    //set colum is equal to 0
                    for (int k = 0; k < nums.length; k++) {
                        if(nums[k][j]!=0)nums[k][j]=-1;
                    }
                }

            }
        }
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                if(nums[i][j]==-1){
                    nums[i][j]=0;
                }
            }
        }
     return nums;
    }
}
