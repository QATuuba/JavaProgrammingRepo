package day14_String;

import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        char ch = word.charAt(0);

        if (ch >=48 && ch <= 57){
            System.out.println("first character is digit");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("first character is lowercase letter");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("first character is uppercase letter");
        }else {
            System.out.println("first character is special character");
        }

    }

}
