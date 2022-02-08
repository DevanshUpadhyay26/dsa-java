package com.devansh;



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1st numbers");
        int a= sc.nextInt();
        System.out.println("Enter number 2nd numbers");
        int b= sc.nextInt();
        System.out.println("Which operation do you want to perform ? ");
        String op= sc.next();
        if(op.equals("+")){                 // used equals() so it will be easy to find res in string
            System.out.println("Addition = "+ (a+b));
        }
        else if(op.equals("-")){
            System.out.println("Subtraction = "+(a-b));
        }
        else if(op.equals("/")){
            System.out.println("Division = "+(a/b));
        }
        else if(op.equals("*")){
            System.out.println("Multiplication = "+(a*b));
        }
        else if(op.equals("%")){
            System.out.println("Modulus = "+(a%b));
        }
        else {
            System.out.println("Error! ");
        }
    }
}
