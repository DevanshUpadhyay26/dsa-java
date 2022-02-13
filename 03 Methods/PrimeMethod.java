package com.devansh;

import java.util.Scanner;

public class PrimeMethod {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter a number" );
       int num=sc.nextInt();
        System.out.println("Is your number is prime? "+isPrime(num));
    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
       int c;
        c = 2;
        while(Math.sqrt(c)<=num){
           if(num%2==0){
               return false;
           }
           c = c + 1;
       }
       return Math.sqrt(c)>num;

    }

}
