package day14_String;

import java.util.Scanner;

public class PrintTogether {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words");
        String word1 = scan.next();
        String word2 = scan.next();

        char ch1 = word1.charAt(word1.length() - 1);
        char ch2 = word2.charAt(0);

        String s2 = word2.substring(1);

        if (ch1 == ch2) {
            System.out.println(word1 + s2);
        } else {
            System.out.println(word1 + word2);
        }


    }

}
