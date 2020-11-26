package com.xs2wasifali.dp;

public class rodCuttingDp {

    public static int rodCutRec(int[] p, int n){

        int[] val = new int[n+1];
        val[0]=0;
        int i,j;




        for (i = 1; i<=n; i++)
        {
            int max_val = Integer.MIN_VALUE;
            for (j = 0; j < i; j++)
                max_val = Math.max(max_val,p[j]+val[i-j-1]);
            val[i] = max_val;
        }

        return val[n];

    }

    public static void main(String[] args) {

        int[] price = {1, 5, 8, 10, 17, 17, 20};
        int n = price.length;

        System.out.print(rodCutRec(price, n));
    }

}
