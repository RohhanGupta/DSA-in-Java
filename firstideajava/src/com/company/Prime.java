package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter the number to be checked ");
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        int c = 2;
        if (num <= 1){
            System.out.println("Neither prime nor composite");
        } else {
            while (c*c <num){
                if (num % c ==0){
                    System.out.println("Not prime");
                    return;
                }
                c = c+1;
            }
            if (c * c > num){
                System.out.println("It is prime");
            }
        }
    }
}
