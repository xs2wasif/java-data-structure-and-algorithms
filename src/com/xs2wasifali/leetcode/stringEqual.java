package com.xs2wasifali.leetcode;

import java.util.*;

public class stringEqual {

    public static boolean stringArrayEqual(String[] word1, String[] word2){

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <word1.length; i++) {
            stringBuilder.append(word1[i]);
        }
        String w1= new String(stringBuilder.toString());

        stringBuilder.setLength(0);
        for (int i = 0; i <word2.length; i++) {
            stringBuilder.append(word2[i]);
        }
        String w2= new String(stringBuilder.toString());

        return w1.equals(w2);

    }

    public static void main(String[] args){
        String[] word1={"a","bc","d"};
        String[] word2={"a","cbd"};

        System.out.println(stringArrayEqual(word1,word2));
    }

}
