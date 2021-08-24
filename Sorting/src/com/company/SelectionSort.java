package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {42,534,12,-14,343};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]){
        for (int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int max = getmaxindex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static int getmaxindex(int arr[], int start, int last ){
        int max = start;
        for(int i =0; i<=last; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }

        return  max;
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
