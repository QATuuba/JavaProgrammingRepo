package day13_String;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two strings");
        String string1 = scan.nextLine();
        String string2 = scan.next();

        int total1 = string1.length();
        int total2 = string2.length();

        if (total1 > total2){
            System.out.println("The longest string is " + string1);
        }else
            System.out.println("The longest string is " + string2);

    }

}
