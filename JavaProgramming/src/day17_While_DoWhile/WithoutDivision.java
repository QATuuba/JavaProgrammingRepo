package day17_While_DoWhile;

public class WithoutDivision {

    public static void main(String[] args) {

       int num1 = 50;
       int num2 = 9;
       int result = 0;

        while (num1>=num2) {
            num1 -= num2;
                result++;
        }

        System.out.println(result + " with a reminder of " + num1);


    }

}
/*
	1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */