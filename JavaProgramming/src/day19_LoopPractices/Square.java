package day19_LoopPractices;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the side of the square:");
            double side = scan.nextDouble();

            if (side<=0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            double area = side*side;
            double perimeter = 4*side;

            System.out.println("Area of square: " + area);
            System.out.println("Perimeter of square: " + perimeter);

            System.out.println("Would you like to calculate another Square? Yes/No");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Please re-enter a valid entry");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }

        }


    }

}
