package day13_String;

import java.util.Scanner;

public class EmptyCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scan.nextLine();

        int total = str.length();

        if (total == 0){
            System.out.println("String is empty");
        } else if (total > 3) {
            System.out.println(str.substring(total -3));
        }else {
            System.out.println(str);
        }

    }

}
