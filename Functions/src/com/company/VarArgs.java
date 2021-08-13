package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6321,43,53,52,434,32,32,5,2);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
