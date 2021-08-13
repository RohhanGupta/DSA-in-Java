package com.company;

public class Shadowing {

    /*Call it the layer concept,
    if initialized again it will take new value in that block and then as soon as we come out of the block it gains back
    its old value
    */
    static int a = 10;
    public static void main(String[] args) {
        System.out.println(a);
        int a;
        a = 20;
        System.out.println(a);
        print1();
    }

    static void print1(){
        System.out.println(a);
    }
}
