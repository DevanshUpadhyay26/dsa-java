package com.devansh;

import java.util.Scanner;

//if the sum of the ^ last digit num is = to the actual number that is called armstrong
/*
* 1^1=1
* 153=1^3+5^3+3^3
*    =1+125+27= 153
*/
public class Arm {
    public static void main(String[] args) {
        int r,sum=0,temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        n=temp;
        if(sum==n){
            System.out.println("It is an Armstrong Number!");
        }
        else {
            System.out.println("It is not an Armstrong Number!!");
        }
    }
}
