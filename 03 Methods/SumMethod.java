package com.devansh;

import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        int sum=ADD(num1,num2);
        System.out.println(sum);
    }
    static int ADD(int num1,int num2){
        return (num1+ num2);
    }
}
