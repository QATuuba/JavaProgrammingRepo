package day14_String;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = scan.nextLine();
        String first = word.substring(0,1);

        if (first.equals("x")){
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }



    }

}
