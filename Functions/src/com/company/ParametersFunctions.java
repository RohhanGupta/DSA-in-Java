package com.company;

public class ParametersFunctions {
    public static void main(String[] args){
        sum(5,6);
        int ans= sum1(4,6);
        System.out.println(ans);
    }

    //Function with parameters but no return
    static void  sum(int num1, int num2){
        int sum = num1+num2;
        System.out.println("The sum is: "+ sum);
    }

    //Function with parameters and return
    static int sum1(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}
