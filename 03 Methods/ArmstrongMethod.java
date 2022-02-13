package com.devansh;

import java.util.Scanner;

public class ArmstrongMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbe: ");
        int num=sc.nextInt();
        System.out.println(isArmstrong(num));
    }
    static boolean isArmstrong(int n){
        int sum=0,temp,rem;
        temp=n;
        while (n > 0) {
            rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum==temp;
    }
}
