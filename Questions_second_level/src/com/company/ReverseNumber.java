package com.company;

public class ReverseNumber {
    public static void main(String[] args) {
        int num= 12345;
        int sum = 0;
        while(num>0){
            int remainder = num%10;
            sum= sum*10+remainder;
            num=num/10;
        }
        System.out.println(sum);
    }
}
