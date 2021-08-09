package com.company;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args){
        System.out.println("Entwr your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String department= "sales";
        switch (name) {
            case "Rohan" -> System.out.println("Emp name rohan");
            case "Rahul" -> System.out.println("Emo name rahul");
            case "Aviral" -> System.out.println("Emp name aviral");
            case "Kanwar" -> {
                System.out.println("Emp name kanwar");
                switch (department) {
                    case "IT" -> System.out.println("dept is it");
                    case "MKT" -> System.out.println("dept is mkt");
                    case "sales" -> System.out.println("dept is sales");
                    default -> System.out.println("enter a valid dept");
                }
            }
            default -> System.out.println("No such employee");
        }
        }
    }
