package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomAreaOfCircle {

    public static void main(String[] args) {

        areaOfCircle();

    }

    public static void areaOfCircle(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = scan.nextDouble();

        double area = radius * radius * 3.14;
        System.out.println("Area of the circle is: " + area);

    }

}
