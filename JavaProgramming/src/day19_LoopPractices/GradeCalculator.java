package day19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score <0 || score > 100){
                System.err.println("Invalid entry");
                System.exit(0);
            }

            if (score>=90 && score<=100){
                System.out.println("Your grade is: " + 'A');
            } else if (score>=80 && score<= 89) {
                System.out.println("Your grade is: " + 'B');
            } else if (score>=70 && score<=79) {
                System.out.println("Your grade is: " + 'C');
            } else if (score>=60 && score<=69) {
                System.out.println("Your grade is: " + 'D');
            }else {
                System.out.println("Your grade is: " + 'F');
            }

            System.out.println("Would you like to calculate another score? Yes?No");
            String answer = scan.next();

            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry");
                System.exit(0);
            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }


        }

    }

}
