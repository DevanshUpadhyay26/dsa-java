package com.devansh;

public class ParametersIntFn {
    public static void main(String[] args) {
        //pass the value of fn when ur calling the method in main fn
        System.out.println(sum(3,4));
    }
    static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
}
