package com.dsa.Matrix;

import java.util.Arrays;

public class SetMatrixZeroesOptimal {


    public static void main(String[] args) {

        int[][] nums={{1,1,1,1},{1,1,0,1},{1,0,1,1},{0,1,1,1}};

        int[][] ans= setMatrixZeroes(nums);

        for(int i=0;i< ans.length;i++)
        {
            System.out.println(Arrays.toString(nums[i]));

        }
    }
    static int[][] setMatrixZeroes(int[][] nums)
    {
        int col0=1;
   int n = nums.length;
   int m=nums[0].length;
        //inplace Marking rows and cols

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                if(nums[i][j]==0){
                    //Mark row as zero
                    nums[i][0]=0;
                    //Mark column as zero
                    if(j!=0) nums[0][j]=0;
                    else{
                        col0=0;
                    }
                }

            }
        }

        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <m ; j++) {

                if(nums[i][0]==0 || nums[0][j]==0){
                    nums[i][j]=0;
                }

            }
        }
        //Make rows as zero
        if(nums[0][0]==0)
        {
            for (int i = 0; i < n; i++) {
                nums[0][i]=0;
            }
        }
        //First Make first cols as zero
        if(col0==0){
            for (int i = 0; i <m ; i++) {
               nums[i][0]=0;
            }
        }

        return nums;
    }
}
