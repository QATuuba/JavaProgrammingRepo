package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        double sum = 0;//if you put int, you will see 5050. but with double it is 5050.0
        //1

        for (int i = 1; i < 101; i++) {
           sum += i;
        }

        System.out.println(sum);

        System.out.println("_______________________________");

        int total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            total += scan.nextInt();
        }
        System.out.println("total = " + total);

        scan.close();
    }
}
