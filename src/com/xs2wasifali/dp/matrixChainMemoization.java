package com.xs2wasifali.dp;

public class matrixChainMemoization {

    public static int matrixChainMemoised(int[] arr,int i, int j){

        int min_value=Integer.MAX_VALUE;

        if(i==j)
            return 0;
        else
            for(int k=i;k<=j-1;k++){

                min_value=Math.min(min_value, matrixChainMemoised(arr,i,k)
                        +matrixChainMemoised(arr,k+1,j)
                        +arr[i-1]*arr[k]*arr[j]);

             //   System.out.print(val[k]);
            }
        return min_value;

    }


    public static void main(String[] args){
        int[] arr = new int[] {1, 2, 3,4,10,20,50};
        int n = arr.length;

        System.out.println(
                "Minimum number of multiplications is "
                        + matrixChainMemoised(arr, 1, n-1));
    }
}
