package com.xs2wasifali.leetcode;

import java.util.*;

public class minEnergy {

    public static int minimumEnergy(int[][] A){

        int res=0;

        Arrays.sort(A, (a1, a2) -> (a1[1] - a1[0]) - (a2[1] - a2[0]));

        for (int[] a : A) {
            res = Math.max(res + a[0], a[1]);
        }

        return res;
    }


    public static void main (String[] args){
        int[][] A= {{1,3},{2,4},{10,11},{10,12},{8,9}};
        //[[1,3],[2,4],[10,11],[10,12],[8,9]]
        System.out.println(minimumEnergy(A));
    }
}
