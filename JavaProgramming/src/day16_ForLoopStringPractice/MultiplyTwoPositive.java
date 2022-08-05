package day16_ForLoopStringPractice;

import java.util.Scanner;

public class MultiplyTwoPositive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive numbers");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= num1; i++) {
            if(num1 >= 0 && num2 >= 0){
                sum += num2;
            }else {
                System.out.println("Invalid");
            }
        }
        System.out.println(sum);

    }

}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid
            Ex:
                inputs:
                    10
                    20
                output:
                    200
 */
