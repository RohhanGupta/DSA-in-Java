package com.company;

public class MaxTdArray {
    public static void main(String[] args) {
        int[][] arr = {
                {-4,2,3},
                {9,4,-55},
                {8,7,6}
        };

        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.println(max);
    }
}
