package com.company;

import java.util.Scanner;

public class FunctionsBasics {

    public static void main(String[] args) {
	    sum();
	    int ans = sum2();
        System.out.println(ans);
    }
    //Function without parameters and return
    static void sum()  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is: "+ sum);
    }

    //Function without parameters but return
    static  int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        return sum;
    }
}
