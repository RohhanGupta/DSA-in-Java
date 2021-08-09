package com.company;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String fruit = in.next();
	switch(fruit){
        case "Apple":
            System.out.println("This a healthy fruit");
            break;
        case "Mango":
            System.out.println("This is king of fruits");
            break;
        case "Orange":
            System.out.println("This is a good fruit");
            break;
        case "Banana":
            System.out.println("This is a yellow fruit");
            break;
        default:
            System.out.println("Enter a valid fruit");
            break;
    }
    }
}
