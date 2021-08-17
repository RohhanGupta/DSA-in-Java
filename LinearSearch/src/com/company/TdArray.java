package com.company;

public class TdArray {
    public static void main(String[] args) {
        int[][] tdarr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        int key = 5;
        //Output od 2d array
        for(int i=0; i<tdarr.length; i++){
            for(int j=0; j<tdarr[i].length;j++){
                if(tdarr[i][j]==key){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}
