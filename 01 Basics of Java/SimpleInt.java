package com.devansh;

import java.util.Scanner;

public class SimpleInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        float p = sc.nextFloat();
        System.out.println("Enter Rate Amount");
        float r = sc.nextFloat();
        System.out.println("Enter Time Amount");
        float t = sc.nextFloat();
        float SI= p*r*t;
        System.out.println("Simple Interest = "+SI);





    }


}
