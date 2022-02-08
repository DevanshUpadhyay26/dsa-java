package com.devansh;

import java.util.Scanner;

public class Countoccure {
    public static void main(String[] args) {
        int n= 545422785;
        int counter=0;
        while(n>0){
            int rem=n%10;
            if (rem==5){
                counter++;
            }
            n=n/10;
        }
        System.out.println(counter);
    }
}
