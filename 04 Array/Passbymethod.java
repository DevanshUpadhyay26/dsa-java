package com.devansh;

import java.util.Arrays;
import java.util.Scanner;

public class Passbymethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arra=new int[5];
        for (int i = 0; i < arra.length ; i++) {
            arra[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arra));
        change(arra);
        System.out.println(Arrays.toString(arra));
    }
    static void change(int[] arr){
        arr[0]=22;
    }
}
