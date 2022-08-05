package day17_While_DoWhile;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        int sum = 0;

        while (num1 > 0) {
            sum += num1;
            System.out.println(sum);
            System.out.println("Enter a number");
            num1 = scan.nextInt();
        }
        scan.close();
    }

}
