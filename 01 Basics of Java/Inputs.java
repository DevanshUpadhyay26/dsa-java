package com.devansh;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("Enter roll no: ");
        int roll_no=input.nextInt();
        System.out.println("ur roll no is: "+ roll_no);
        String name= input.nextLine();
        System.out.printf(name);
        float marks=input.nextFloat();
        System.out.println(marks);



    }
}
