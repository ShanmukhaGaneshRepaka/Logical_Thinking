package com.dsa;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] arr={

                {1,1,1,1},
                {1,0,0,1},
                {1,1,0,1},
                {1,1,1,1}
        };
        setZeroes(arr);
    }


    static void setZeroes(int[][] arr)
    {
    int m=arr.length;
    int n=arr[0].length;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j <n; j++) {
                if(arr[i][j]==0)
                {
                    //Row zeroing
                    for(int k=0;k<m;k++)
                    {
                        if(arr[i][k]!=0){
                            arr[i][k]=-1;
                        }
                    }
//column zeroing
                    for(int k=0;k<n;k++)
                    {
                        if(arr[k][j]!=0) arr[k][j]=-1;
                    }
                }
            }

        }



        //Converting zeroes

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <n; j++) {
                if(arr[i][j]==-1)
                {
                    arr[i][j]=0;
            }
            //System.out.println();
        }
    }
        ///Printion
        for (int i = 0; i < m; i++) {

            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            }
    }
}
