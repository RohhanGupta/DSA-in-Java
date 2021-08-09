package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Please Enter your roll number: ");
        Scanner input= new Scanner(System.in);
        int rollno= input.nextInt();
        System.out.println("Your roll number is " + rollno);
        System.out.print("Please Enter your Name : ");
        Scanner val= new Scanner(System.in);
        String name= val.next();
        System.out.println("Your name is " + name);
    }
}
