package com.devansh;

import java.util.Scanner;

public class CircumArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        float radius= sc.nextFloat();
        double Circumference= circumference(radius);
        double Area= area(radius);
        System.out.println("The Circumference is : "+Circumference);
        System.out.println("The Area is : "+Area);
    }
    static double circumference(float radi){
        return (2*3.14*radi);
    }
    static double area(float radi){
        return (3.14*radi*radi);
    }
}
