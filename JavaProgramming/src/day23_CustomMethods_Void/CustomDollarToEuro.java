package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomDollarToEuro {

    public static void main(String[] args) {

        dollarToEuro();

    }

    public static void dollarToEuro() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter dollar amount");
        double dollar = scan.nextDouble();

        double euro = dollar * 0.96;
        System.out.println(dollar + " Dollar = " + euro + " Euro");

    }

}
