package com.company;

import java.util.Scanner;

public class WeekdayWeekend {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
