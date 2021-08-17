package com.company;

public class MinTdArray {
    public static void main(String[] args) {
        int[][] arr = {
                {-4,2,3},
                {9,4,-55},
                {8,7,6}
        };

        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
