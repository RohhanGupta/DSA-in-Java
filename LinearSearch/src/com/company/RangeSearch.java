package com.company;

public class RangeSearch {
    public static void main(String[] args) {
        int[] array = {1,2,42,14,674,24,764};
        int start = 2;
        int end = 5;
        int key = 42;
        int ans = rangesearch(array, start,end, key );
        System.out.print("Position of the key object is: ");
        System.out.println(ans);
    }

    static int rangesearch(int[] arr, int start, int end, int key){
        for (int i= start; i < end; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

}
