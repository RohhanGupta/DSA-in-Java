package com.company;

import java.util.Scanner;

public class Temperature_Conversion {
    public static void main(String[] args) {
        System.out.println("Press 1 for C to F");
        System.out.println("Press 2 for F to C");
        System.out.print("Enter the type of conversion ");
        Scanner input= new Scanner(System.in);
        int option= input.nextInt();
        if (option == 1){
            System.out.print("Enter the temperature in C ");
            double c= input.nextDouble();
            double f= (c*9)/5 + 32;
            System.out.println("The temperature in F is " + f);
        } if(option == 2){
            System.out.print("Enter the temperature in F ");
            double f= input.nextDouble();
            double c= ((f -32)*5)/9;
            System.out.println("The temperature in C is " + c);
        }
    }
}
