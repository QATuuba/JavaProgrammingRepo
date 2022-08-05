package day13_String;

import java.util.Scanner;

public class Reverse5Character {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");

        String str = scan.nextLine();

        int total = str.length();

        StringBuilder stringBuilder = new StringBuilder(str);

        if (total < 5){
            System.out.println("Too short");
        } else if (total > 5) {
            System.out.println("Too long");
        }else {
            System.out.println(stringBuilder.reverse());
        }


    }

}
