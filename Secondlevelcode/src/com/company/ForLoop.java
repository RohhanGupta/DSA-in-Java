package com.company;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
        Syntax of for loop
        for(initialization; condition, change){
            //body
        }
         */

        // Simple Program to print numbers from 1 to 9
        System.out.print("Enter any number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int n=1; n<num; n++){
            System.out.println(n);
        }
        // Use while when you dont know the number of iterations, use for loop when you know the number of iterations
    }
}
