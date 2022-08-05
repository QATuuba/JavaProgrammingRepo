package day19_LoopPractices;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextDouble();

            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            double diameter = 2 * radius;
            double area = radius * radius * 3.14;
            double perimeter = diameter * 3.14;

            System.out.println("Diameter of circle: " + diameter);
            System.out.println("Area of circle: " + area);
            System.out.println("Perimeter of circle: " + perimeter);

            System.out.println("Would you like to calculate another circle? Yes/No");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Please re-enter a valid entry");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo CircleTask Calculator APP");
                break;
            }
        }

    }

}
