package com.devansh;

import java.util.Scanner;

public class AgeValidateMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter age: ");
        int age= sc.nextInt();
        agevalidator(age);
    }
    static String agevalidator(int a){
        while (a!=0){
            if(a>=18){
                return "You Can Vote!!!!";
            }
            if (a<18){
                return "You Can't Vote!! ";
            }
        }
        return "Zero";
    }
    }



