package com.devansh;
import java.util.Scanner;
// basically last two digits are added to get next digit (digit 1, digit 2, digit3=digit1+digit2.........)
// set= 0,1,1,2,3,5,..........
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int n1=0,n2=1,n3,i;
        System.out.println(n1+" "+n2);
        for( i=2;i< num;++i){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
/*
 *  Dry Run
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * nth
 * */