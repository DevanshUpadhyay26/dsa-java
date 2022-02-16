package com.devansh;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int array[]=new int[5];
        for (int i = 0; i <5 ; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i <1 ; i++) {
            System.out.println("Before swapping: "+ Arrays.toString(array));
        }
        swap(array,0,1);
        System.out.println("After Swapping: "+ Arrays.toString(array));
    }
    //
    static void swap(int[] arr, int index_1, int index_2){
        int temp=index_1;
        index_1=index_2;
        index_2=temp;
    }



}
