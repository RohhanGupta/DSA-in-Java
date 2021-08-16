package com.company;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.print("Enter your target number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
	    int[] list = {2,54,656,32,6,32};
	    int answer = Linearsearch(list, n);
        System.out.println(answer);
    }

    static int Linearsearch(int arr [], int key){
        for (int i = 0; i < arr.length; i++ ){
            if(arr[i]==key){
                return i;
            }
        }
        return 0;
    }

}
