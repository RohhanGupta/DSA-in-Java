package com.company;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i<5; i++){
            array[i] = input.nextInt();
        }

        for(int i = 0; i<5; i++){
            System.out.println(array[i]);
        }
    }
}
