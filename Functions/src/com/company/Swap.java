package com.company;

public class Swap {
    public static void main(String[] args) {
        int num = 20;
        int num2= 30;
        swap(num, num2);
        //Only the variables in the function change the values not the actual variables
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
