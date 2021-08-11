package com.company;

public class StringFunction {
    public static void main(String[] args){
        String message = greet();
        System.out.println(message);
    }

    static String greet(){
        String greeting = "How are you dear!?";
        return greeting;
    }
}
