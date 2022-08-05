package day18_NestedLoop;

import java.util.Scanner;

public class CalculateTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number");
            int num1 = scan.nextInt();

            System.out.println("Enter a math operator");
            char ch = scan.next().charAt(0);

            while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
                System.out.println("Invalid operator, please re-enter the operator");
                ch = scan.next().charAt(0);
            }

            System.out.println("Enter the second number");
            int num2 = scan.nextInt();

            int total = 0;

            if (ch == '+'){
                total = num1 + num2;
            } else if (ch == '-') {
                if (num1>num2) {
                    total = num1 - num2;
                }else {
                    total = num2 - num1;
                }
            } else if (ch == '*') {
                total = num1*num2;
            }else {
                if (num1>num2) {
                    total = num1 / num2;
                }else {
                    total = num2 / num1;
                }
            }

            System.out.println(total);

            System.out.println("Would you like to continue?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid answer. Please re-enter, Would you like to continue?");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }

        }
    }

}
