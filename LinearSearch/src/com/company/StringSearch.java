package com.company;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        System.out.print("Enter your string input: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char c = 'a';
        int s = search(str, c );
        System.out.print("Element location is: ");
        System.out.println(s);
    }

    static int search(String str, char key){
        for(int i=0; i<str.length(); i++){
            if(key==str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
