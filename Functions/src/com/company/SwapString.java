package com.company;

public class SwapString {
    public static void main(String[] args) {
        String name = "Rohan";
        swap(name);

        //Only the variables in the function change the values not the actual variable.

    }

    static void swap(String naam){
        naam = "CoolDude_69";
        System.out.println(naam);
    }
}
