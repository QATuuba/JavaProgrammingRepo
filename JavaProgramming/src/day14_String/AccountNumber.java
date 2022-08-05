package day14_String;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number");
        String accountNumber = scan.next();

        int length = accountNumber.length();

        if (accountNumber.startsWith("2") && length == 7) {
            System.out.println("Valid");
        } else if (accountNumber.startsWith("5")  && length == 10) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid account number");
        }
        scan.close();

    }

}
