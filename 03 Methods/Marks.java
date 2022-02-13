package com.devansh;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks=sc.nextInt();
        System.out.println("Result= "+marks(marks));
    }
    static String marks(int Grades){
        if(Grades>=91){
            return "AA";
        }
        if(Grades>=81){
            return "AB";
        }
        if(Grades>=71){
            return "BB";
        }
        if(Grades>=61){
            return "BC";
        }
        if(Grades>=51){
            return "CD";
        }
        if(Grades>=41){
            return "DD";
        }
        return "Failed";
    }
}
