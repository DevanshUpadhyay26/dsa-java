package com.devansh;

public class BinaryOddEven {
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            System.out.println(i+" "+BinaryODDEven(i));
        }
    }
    static String BinaryODDEven(int a){
        while (a!=0){
            if(Integer.toBinaryString(a).endsWith("0")){
                return "Even";
            }
            else {
                return "Odd";
            }
        }
        //If data is 0 then return this
        return "Zero";
    }
}
