package com.company;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int n=1; n<num; n++){
            System.out.println(n);
        }

    }
}
