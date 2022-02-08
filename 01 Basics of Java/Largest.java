package com.devansh;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a>b){
            System.out.println("A is larger than b");
        }
        else {
            System.out.println("B is Larger than a");
        }

    }
}
