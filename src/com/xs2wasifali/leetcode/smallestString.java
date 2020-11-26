package com.xs2wasifali.leetcode;

import java.util.Arrays;

public class smallestString {

/*    public static String getCharForNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }
*/
    public static void main(String[] args){
        int n=2;
        int k=10;

        char temp;
        char[] chars = new char[n];
        Arrays.fill(chars, 'a');

        k-=n;

        while (k > 0) {
            if (chars[n - 1] < 'z') {
                chars[n - 1]++;
                k--;
            } else {
                n--;
            }
        }


        System.out.print(new String(chars));



//        System.out.println(getCharForNumber(1));


    }

}
