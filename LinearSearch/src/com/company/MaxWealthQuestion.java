package com.company;

public class MaxWealthQuestion {
    public static void main(String[] args) {
        int id = 0;
        int max=Integer.MIN_VALUE;
        int[][] arr = {{1,2,3},{2,6,5},{3,4,5}};
        for(int i=0; i<arr.length;i++){
            int a = maxwealth(arr,i);
            if(a>max){
                max = a;
                id = i+1;
            }
        }
        System.out.println("The Max wealth is " + max + " which is of client " + id);
    }

    static int maxwealth(int[][] arr,int i){
        int sum = 0;
        for (int j=0; j<arr[i].length;j++){
            sum = sum + arr[i][j];
        }
        return sum;
    }

}
