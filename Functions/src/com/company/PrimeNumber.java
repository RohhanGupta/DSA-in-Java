package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("The number is prime: " + isprime(num));
    }

    static boolean isprime(int n){
        if(n<=0){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
               return false;
            }
            c++;
            if(c*c>n){
                return true;
            }
        }
        return false;
    }
}
