package com.xs2wasifali.dp;

public class rodCuttingRecursion {

    public static int rodCut(int[] p, int n){

        int max_val=Integer.MIN_VALUE;
        if(n==0)
            return 0;

        for(int i=0;i<n;i++){
            max_val = Math
                    .max(max_val,p[i]+rodCut(p,n-i-1));
        }
        return 0;
    }

    public static void main(String[] args){

        int[] price = {1, 5, 8, 10, 17, 17, 20};
        int n=price.length;

        System.out.print(rodCut(price,n));

    }

}
