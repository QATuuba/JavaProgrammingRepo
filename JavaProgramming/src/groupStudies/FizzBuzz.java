package groupStudies;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();


        for (int i = 1; i <= n; i++) {
            if (i%15==0){
                System.out.println("FizzBuzz");
            } else if (i%3 == 0 && !(i%5 ==0)) {
                System.out.println("Fizz");
            } else if (i%5 == 0 && !(i%3 == 0)) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }

        }


    }




}
