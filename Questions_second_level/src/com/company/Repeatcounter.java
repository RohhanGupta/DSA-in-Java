package com.company;

import java.util.Scanner;

public class Repeatcounter {
    public static void main(String[] args){
        int num = 543455;
        int count = 0;
        while (num>0){
            int remainder= num%10;
            if (remainder==5){
                count++;
            }
            num= num/10;
        }
        System.out.println(count);
    }
}
