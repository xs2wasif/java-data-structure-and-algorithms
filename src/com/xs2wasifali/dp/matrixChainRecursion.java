package com.xs2wasifali.dp;

public class matrixChainRecursion {

    public static int matrixChain(int[] arr, int i, int j){

        if (i==j)
            return 0;

        int min_value=Integer.MAX_VALUE;

        for(int k=i;k<j;++k){

            min_value=matrixChain(arr,i,k)+
                    matrixChain(arr,k+1,j)+
                    arr[i-1]*arr[k]*arr[j];


        }


        return min_value;

    }

    public static void main(String[] args){
        int[] arr = new int[] { 1, 2, 3, 4, 3 };
        int n = arr.length;

        System.out.println(
                "Minimum number of multiplications is "
                        + matrixChain(arr, 1, n - 1));
    }
}


