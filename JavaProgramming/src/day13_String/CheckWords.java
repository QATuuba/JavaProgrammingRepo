package day13_String;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three words");
        String word1 = scan.next();
        String word2 = scan.next();
        scan.nextLine();
        String word3 = scan.nextLine();

        int l1 = word1.length();
        int l2 = word2.length();
        int l3 = word3.length();

        if ( l1 == l2 && l2 == l3){
            System.out.println("All words are same length");
        } else if ((l1 == l2 && l2 != l3) || (l1 != l2 && l2 == l3)) {
            System.out.println("Not Same nor Different lengths");
        }else {
            System.out.println("All different length");
        }

    }

}
