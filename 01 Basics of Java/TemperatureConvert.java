package com.devansh;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Temperature in Calsius");
        float TempC= sc.nextFloat();
        float TempF= (TempC * 9/5)+32;
        System.out.println("Temperature in Fahrenheit: "+TempF);



    }
}
