package day13_String;

import java.util.Scanner;

public class FirstLastSame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String string1 = scan.next();

        int total = string1.length()-1;

        char f = string1.charAt(0);
        char l = string1.charAt(string1.length()-1);

        if (f == l){
            System.out.println("The first and last characters are the same");
        }else {
            System.out.println("The first and last characters are NOT the same");
        }

    }

}
