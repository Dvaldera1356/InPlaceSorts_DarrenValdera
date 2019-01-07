package com.company;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int i;
        int[] ar1 = new int[10];
        for( i = 0; i <  ar1.length; i++) {
        ar1[i] = (int)(Math.random() * 100);
        System.out.print(ar1[i] + "  ");
        }
    }
}
