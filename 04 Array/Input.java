package com.devansh;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // array of primitives
//        int[] arr=new int[5];
//        arr[0]=11;
//        arr[1]=22;
//        arr[2]=33;
//        arr[3]=44;
//        arr[4]=55;
//       // System.out.println(arr[4]);
//        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//        System.out.println(Arrays.toString(arr));
        // array of objects
        String[] str=new String[4];
        for (int i = 0; i <str.length; i++) {
            str[i] = sc.next();
        }
        str[0]="Devans";
        System.out.println(Arrays.toString(str));

    }
}
