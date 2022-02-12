package com.devansh;
import java.util.Scanner;
public class factMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number=sc.nextInt();
        int fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
    static int factorial(int n){
        if (n == 0 || n==1)
            return 1;
        else
            return(n * factorial(n-1));
    }
}
