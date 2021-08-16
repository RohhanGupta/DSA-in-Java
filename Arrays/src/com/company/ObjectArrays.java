package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class ObjectArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String[] str = new String[5];
        for (int i = 0; i<str.length; i++){
            str[i] =  input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
