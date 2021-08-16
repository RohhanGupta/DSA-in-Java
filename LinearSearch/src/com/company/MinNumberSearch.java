package com.company;

public class MinNumberSearch {
    public static void main(String[] args) {
        int[] arr = {2,43,433,-5,23,1,44};
        int ans = findmin(arr);
        System.out.println(ans);
    }

    static int findmin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}
