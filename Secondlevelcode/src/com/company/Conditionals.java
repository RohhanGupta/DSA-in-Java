package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        System.out.print("Enter any number of your choice: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num > 10) {
            System.out.println("The number is greater than 10");
        } else if (num == 10) {
            System.out.println("The number is equal to 10");
        } else {
            System.out.println("The number is less than 10");
        }
    }
}
