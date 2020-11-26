package com.xs2wasifali.leetcode;

public class movingZeros {
    public static int[] mZeros(int[] arr){
        int len=arr.length;

        for(int i=0;i<len;++i){
            for(int j=1;j<len;++j){
                if(arr[j-1]==0){
                    arr[j-1]=arr[j-1]+arr[j];
                    arr[j]=arr[j-1]-arr[j];
                    arr[j-1]=arr[j-1]-arr[j];
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = {1,0,1,0,2};
        int[] output=mZeros(input);

        for(int i = 0; i < output.length; i++) //for loop to print the array
            System.out.print( output[i]+ " ");

    }

}
