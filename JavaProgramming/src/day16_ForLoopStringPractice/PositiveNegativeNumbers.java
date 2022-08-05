package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PositiveNegativeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {

            int num = scan.nextInt();
            if (num > 0){
                positive++;
            } else if (num <0) {
                negative++;
            }
        }

        System.out.println(positive + " positive and " + negative + " negative");
    }

}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3
				Output:
					3 positive and 1 negative
 */