package com.devansh;

import java.util.Arrays;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        /*
        *    1 2 3
        *    4 5 6
        *    7 8 9
        */
        int[][] multi=new int[3][]; // int[][] array_name=new int[no . of rows][no. of columns]
        //or
//        int[][] arr= {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };                         // hard way
        Scanner sc=new Scanner(System.in);

        int[][] arra=new int[3][3];
//        System.out.println(arra.length);   //no. of rows
        // input for 3d array
        for (int row = 0; row < arra.length ; row++) {
            for (int col = 0; col <arra[row].length ; col++) {
                arra[row][col]=sc.nextInt();
            }
        }
        // output
//        for (int row = 0; row < arra.length ; row++) {
//            System.out.print(Arrays.toString(arra[row])+" ");
//        }
//    }
        for (int[] ints : arra) {
            System.out.print(Arrays.toString(ints) + " ");
        }
}
}
