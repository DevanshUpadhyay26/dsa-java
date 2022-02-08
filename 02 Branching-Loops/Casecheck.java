package com.devansh;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch= sc.next().trim().charAt(2);
        // Now to check the whether entered string is character or not
        if(ch>'a'&&ch<='z'){                    //return the true statement when the entered character is in small case
            System.out.println("SmallerCase");
        }else{
            System.out.println("UpperCase");
        }
    }
}
