package day19_LoopPractices;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String a = scan.next();

            if (!(a.equalsIgnoreCase("no" ) || a.equalsIgnoreCase("yes"))) {
                System.err.println("Invalid entry");
                System.exit(0);
            }

            if (a.equalsIgnoreCase("no")){
                System.err.println("Thank you");
                break;
            }
        }
    }

}
