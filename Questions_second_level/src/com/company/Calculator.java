package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter the operator: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        int ans = 0;
        while (true) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter two numbers ");
                int a = in.nextInt();
                int b = in.nextInt();
                if (ch == '+') {
                    ans = a+b;
                    System.out.println(ans);
                }
                if (ch == '-') {
                    ans = a-b;
                    System.out.println(ans);
                }
                if (ch == '*') {
                    ans = a*b;
                    System.out.println(ans);
                }
                if (ch == '/') {
                    ans = a/b;
                    System.out.println(ans);
                }
                if (ch == '%') {
                    ans = a%b;
                    System.out.println(ans);
                }
            } else if (ch == 'x' || ch == 'X') {
                System.out.println("Calculator over");
                break;
            } else {
                System.out.println("Invalid Operator!");
                break;
            }
        }
    }
}
