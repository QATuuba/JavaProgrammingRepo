package day13_String;

import java.util.Scanner;

public class ThreeLetter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a three letter word");
        String word = scan.nextLine();

        int total = word.length();

        char ch = word.charAt(1);

        if (total == 3){
            if (ch == 'a'){
                System.out.println("Cool word");
            }else {
                System.out.println("Okay word");
            }
        }else {
            if (total > 3){
                System.out.println("Word is too long");
            }else {
                System.out.println("Word is too short");
            }
        }

    }

}
