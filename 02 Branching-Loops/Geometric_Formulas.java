package com.devansh;

import java.util.Scanner;

public class Geometric_Formulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome User !!");
        System.out.println("Kindly Enter your Choice !! ");
        System.out.println("1. Perimeter\n2. Area");
        String ch=sc.next();
        if(ch.equals("1")){
            System.out.println("Select the choice of formula! ");
            System.out.print("1. Circle"+" "+ "2. Equilateral Triangle"+" "+"3. Parallelogram"+" "+ "4. Square"+" "+ "5. Rectangle:  ");
            String Pch=sc.next();
            if(Pch.equals("1")){
                System.out.println("Enter Radius: ");
                float c_radius=sc.nextFloat();
                double perimeterC= (float) 2*(3.14*c_radius);
                System.out.println("Perimeter = "+perimeterC);
            }
            if(Pch.equals("2")){
                System.out.println("Enter Side: ");
                float sideET= sc.nextFloat();
                double perimeterET=(float)3*sideET;
                System.out.println("Perimeter = "+perimeterET);
            }
            if(Pch.equals("3")){
                System.out.print("Enter Base : ");
                float baseP= sc.nextFloat();
                System.out.print("Enter Side : ");
                float sidesP=sc.nextFloat();
                double PerimeterPa=(float) 2*(sidesP+baseP);
                System.out.print("Perimeter = "+PerimeterPa);
            }
            if(Pch.equals("4")){
                System.out.print("Enter Side : ");
                float sidesS= sc.nextFloat();
                double PerimeterS=(float) 4*sidesS;
                System.out.println("Perimeter = "+PerimeterS);
            }
            if(Pch.equals("5")){
                System.out.print("Enter Length : ");
                float lenthRect= sc.nextFloat();
                System.out.print("Enter Width : ");
                float widthRect= sc.nextFloat();
                double PerimeterR=(float) 2*(lenthRect+widthRect);
                System.out.println("Perimeter = "+PerimeterR);
            }

        }
        else if(ch.equals("2")){
                System.out.println("Select the choice of formula! ");
                System.out.print("1. Circle"+" "+ "2. Triangle"+" "+"3. Rectangle"+" "+ "4. Isosceles Triangle"+" "+ "5. Parallelogram :  ");
                String Ach=sc.next();
                if(Ach.equals("1")){
                    System.out.println("Enter Radius: ");
                    float radius_Circle = sc.nextFloat();
                    float area_circle= (float) (3.14*(radius_Circle*radius_Circle));
                    System.out.println("Area = "+area_circle);
                }
                if(Ach.equals("2")){
                    System.out.println("Enter Height: ");
                    float triangle_height= sc.nextFloat();
                    System.out.println("Enter Base: ");
                    float triangle_base= sc.nextFloat();
                    float area_triangle= triangle_base*triangle_height/2;
                    System.out.println("Area = "+area_triangle);
                }
                if(Ach.equals("3")){
                    System.out.println("Enter Length: ");
                    float length_Rect= sc.nextFloat();
                    System.out.println("Enter Width: ");
                    float width_Rect= sc.nextFloat();
                    float area_rect= length_Rect*width_Rect;
                    System.out.println("Area = "+area_rect);
                }
                if(Ach.equals("4")){
                    System.out.println("Enter Base: ");
                    float Base_IsosTri=sc.nextFloat();
                    float height_IsosTri= sc.nextFloat();
                    float Area_isosceles_tri=Base_IsosTri*height_IsosTri/2;
                    System.out.println("Area = "+Area_isosceles_tri);
                }
                if(Ach.equals("5")){
                    float Base_Parallel=sc.nextFloat();
                    float height_Parallel= sc.nextFloat();
                    float Area_Parallel=Base_Parallel*height_Parallel;
                    System.out.println(Area_Parallel);
                }
        }
        else{
            System.out.println("Wrong Input!!!");
        }
    }
}
