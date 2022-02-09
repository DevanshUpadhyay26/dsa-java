package com.devansh;

import java.util.Scanner;

public class ParameterStringFn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String naam=sc.next();                              //for taking input from user
        System.out.println(myGreet(naam));                  // while calling fn we used the user's input
    }
    static String myGreet(String name){
        String message= "Hello " +name;
        return message;             // Now this will return the message
    }
}
