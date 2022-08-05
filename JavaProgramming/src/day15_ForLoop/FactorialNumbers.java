package day15_ForLoop;

import java.util.Scanner;

public class FactorialNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int fact = 1;
        int num = scan.nextInt();

        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.println(fact);


    }

}
