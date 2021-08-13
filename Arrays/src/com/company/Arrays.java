package com.company;

public class Arrays {
    public static void main(String[] args) {
        //Q1: Store 5 roll numbers
        // Array syntax: datatype[] variable_name = new datatype[size];
        int[] rollnumbers = new int[5];
        //Or directly
        int[] rollnumbers2 = {23,23,53,52,51};
        System.out.println(rollnumbers2[2]);

        //declaration of array, roll number is defined in the stack
        // Initialization: Actually here object is being created in the heap

        System.out.println(rollnumbers[1]);
        //This will give us 0 as this is the default value

    }
}
