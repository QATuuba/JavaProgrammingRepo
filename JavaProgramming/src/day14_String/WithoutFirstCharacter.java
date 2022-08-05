package day14_String;

import java.util.Scanner;

public class WithoutFirstCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words");

        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        word1 = word1.substring(1);
        word2 = word2.substring(1);

        System.out.println(word1 + word2);

    }

}
