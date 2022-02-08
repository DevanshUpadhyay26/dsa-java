package com.devansh;
import java.util.Scanner;
// Palindrome numbers are those number which are same even if u reverse the number for e.g. 121,232,454....etc
public class Palindrome {
    public static void main(String[] args) {
        int r,temp,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        temp= n;
        while (n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        n=temp;
        if(sum==n){
            System.out.println("Its an Palindrome number");
        }
        else{
            System.out.println("Not an palindrome number");
        }
    }
}
/*
    Working concept
    *  temp=original number
    *  reverse= og num mod 10 (so that we can get last digit of number)
    *  sum= sum*10+r here we multiplied the sum with 10 and added reverse number
    * n=n/10; so that it could go in loop

    Dry Run
    * 121= Palindrome
    * 1246=not a palindrome
    *
*/

