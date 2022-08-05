package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();

            if (number < min){
                min =number;
            }
        }
        System.out.println("min = " + min);

    }

}
/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */