package com.dsa.Matrix;
import java.util.*;
public class Rotate90degreesBrute {
    public static void main(String[] args) {
int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

     int ans[][] =   rotateMatrix90Degrees(arr);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(Arrays.toString(ans[i]));

        }
    }
    static int[][] rotateMatrix90Degrees(int[][] nums)
    {
        int[][] ans = new int[nums.length][nums[0].length];
        int k=0;
        for (int i = nums.length-1; i>=0 ; i--) {

            for (int j = 0; j <nums.length ; j++) {
                ans[j][i]=nums[k][j];
            }
            k++;

        }
        return ans;
    }
}
