package com.company;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {243,3323,54,221,444,3322};
        int ans = evenDigit(arr);
        System.out.println(ans);
    }

    static int evenDigit(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int a = even(arr[i]);
            if(a==-2){
                count++;
            }
        }
        return count;
    }

    static int even(int a){
        int flag = 0;
        while (a>0){
            a=a/10;
            flag++;
        }
        if(flag%2==0){
            return -2;
        }else{
            return -1;
        }
    }

}
