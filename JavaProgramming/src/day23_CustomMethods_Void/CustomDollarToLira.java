package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomDollarToLira {

    public static void main(String[] args) {

        dollarToLira();

    }

    public static void dollarToLira(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Dollar amount");
        double dollar = scan.nextDouble();

        double lira = dollar * 16.69;
        System.out.println(dollar + " Dollar = " + lira + " Turkish Liras");

    }

}
