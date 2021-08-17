package com.company;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {120,100,89,67,10,2};
        int ans = orderAgnostic(arr, 67);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr , int key){
        int start = 0;
        boolean isAsc;
        int end = arr.length-1;
        if(arr[start]<arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(isAsc==true){
                if (arr[mid]>key){
                    end = mid -1;
                }else if(arr[mid]<key){
                    start=mid+1;
                }
            }else{
                if (arr[mid]<key){
                    end = mid -1;
                }else if(arr[mid]>key){
                    start=mid+1;
                }
            }
        }
        return -1;
    }

}
