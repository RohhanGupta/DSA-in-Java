package com.company;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        System.out.print("Enter the character of your choice: ");
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch<= 'z'){
            System.out.println(ch + " is lower case");
        }else{
            System.out.println(ch + " is upper case");
        }
    }
}
