package com.devansh;

import java.util.Scanner;

public class PrimeMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime it is ");
        }
        else {
            System.out.println("Not an Prime");
        }

    }
    static boolean isPrime(int num){
        boolean isPrime=true;
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
