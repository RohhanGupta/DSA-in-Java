package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner input= new Scanner(System.in);
        int num1= input.nextInt();
        System.out.print("Enter the second number: ");
        int num2= input.nextInt();
        int sum= num1+num2;
        System.out.print("Your answer is " + sum);
    }
}
