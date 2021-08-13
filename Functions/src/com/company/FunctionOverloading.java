package com.company;

public class FunctionOverloading {
    public static void main(String[] args) {
        /*
        Function overloading happens when two functions with the same name but different arguments is declared
         */
        func(2,3);
        func(4,5,6);
    }

    static void func(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    static void func(int a, int b, int c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
