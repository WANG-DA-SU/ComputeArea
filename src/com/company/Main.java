package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creat s Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius * 3.14159;

        //Display results
        System.out.println("The area for the circle of radius "+ radius + " is " + area);
    }
}
//public class Main{
//    public static void mian(String[] args){
//        double radius;
//        double area;
//        //Step 1 : Read in radius
//
//        //Step 2 : Compute area
//
//        //Step 3 ：Display the area
//    }
//        }
//public class Main {
//
//    public static void main(String[] args) {
//        double radius;//Declare radius
//        double area;//Declare area
//        //Assign a radius
//        radius = 20;//radius is now 20
//        //compute area
//        area = radius * radius * 3.1459;
//        //Display results
//        System.out.println("The area for the circle of radius " +
//                radius + " is "+ area);
//    }
//}