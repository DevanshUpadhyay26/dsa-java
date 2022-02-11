package com.devansh;

import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1= sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        System.out.print("Enter number 3: ");
        int num3=sc.nextInt();
        System.out.println("Largest value: "+maximum(num1,num2, num3));
        System.out.println("Smallest value: "+minvalue(num1,num2, num3));
    }
    static  int maximum(int a,int b,int c){
        int maxValue = a;
        if(maxValue<b){
            maxValue=b;
        }
        if (maxValue<c){
            maxValue=c;
        }
        return maxValue;
    }
    static int  minvalue(int a, int b, int c){
        int minValue= a;
        if(minValue>b){
            minValue=b;
        }
        if(minValue>c){
            minValue=c;
        }
        return minValue;
    }
}
