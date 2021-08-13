package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number to be checked: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("The given number is a armstrong number: " + isarmstrong(num));
    }

    static boolean isarmstrong(int n){
        int temp = n;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum = sum+ rem*rem*rem;
            temp = temp/10;
        }
        if(sum==n){
            return true;
        }else{
            return false;}
    }

}
