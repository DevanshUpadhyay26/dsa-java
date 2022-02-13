package com.devansh;

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Sum= "+Natural(num));
    }
    static int Natural(int num){
        return (num*(num+1)/2);
    }

}
