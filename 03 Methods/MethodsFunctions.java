package com.devansh;

import java.util.Scanner;

public class MethodsFunctions {
    public static void main(String[] args) {
        sum();

    }
        static  void sum(){
            Scanner sc = new Scanner(System.in);
            int no= sc.nextInt();
            int no2= sc.nextInt();
            int sum= no+no2;
            System.out.println("The Sum is: "+ sum);
        }


}
/*
* retrun_type fn_name(){
*       //body
*   }
*
*
*
*
*/