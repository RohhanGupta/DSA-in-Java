package com.company;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a + " Is the largest");
            }
        }else if(b>c){
            System.out.println(b + " Is the largest");
        }else{
            System.out.println(c + " Is the largest");
        }
        
        /*
        Or use
        max= math.max(a, math.max(b,c))
         */
    }
}
