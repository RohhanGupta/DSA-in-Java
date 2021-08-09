package com.company;

import java.util.Scanner;

public class NumberandDays {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num){
          case 1 -> System.out.println("Sunday");
          case 2 -> System.out.println("Monday");
          case 3 -> System.out.println("Tuesday");
          case 4 -> System.out.println("Wednesday");
          case 5 -> System.out.println("Thrusday");
          case 6 -> System.out.println("Friday");
          case 7 -> System.out.println("Saturday");
          default -> System.out.println("This is not happening");
        }
    }
}
