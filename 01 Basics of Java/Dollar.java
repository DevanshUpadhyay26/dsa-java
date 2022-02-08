package com.devansh;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter INR");
        int inr=sc.nextInt();
        double dollar = inr* 0.013;
        System.out.println("Dollar value = "+dollar+"$");




    }
}
