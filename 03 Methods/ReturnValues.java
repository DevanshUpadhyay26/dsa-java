package com.devansh;
import java.util.Scanner;
public class ReturnValues {
    public static void main(String[] args) {
        int ans=sum();
        System.out.println(ans);
    }
    static  int  sum(){
        Scanner sc = new Scanner(System.in);
        int no= sc.nextInt();
        int no2= sc.nextInt();
        int sum= no+no2;
         return sum;
    }
}
