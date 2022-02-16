package com.devansh;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList<datatype> name= new ArrayList<>();
        ArrayList<Integer> arrlist= new ArrayList<>();
        // You can Add,Update,Delete through index
        //Adding
//        arrlist.add(64);        //arraylist_name.add(item);
//        //Updating
//        arrlist.set(0,1);       // ArrayList_name.set(index,new Item);
//        //Delete
//        arrlist.remove(0);   //ArrayList_name.remove(index_number_to_be_removed);
        //Taking input from users
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            arrlist.add(sc.nextInt());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(arrlist.get(i)+" ");   //Pass index here
            //list(index) will not work here
        }
    }
}
