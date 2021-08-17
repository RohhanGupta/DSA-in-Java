package com.company;

public class BinarySearch {

    public static void main(String[] args) {
	    int[] arr= {-50,-21,-2,1,5,32,46,67,89};
	    int ans = binarysearch(arr, 5);
        System.out.println("The target element is at " + ans);
    }

    static int binarysearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while (start <=end){
            int mid = start + (end-start)/2;
            if (arr[mid]>key){
                end = mid -1;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
