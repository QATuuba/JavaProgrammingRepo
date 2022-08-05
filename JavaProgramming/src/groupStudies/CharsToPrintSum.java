package groupStudies;

import java.util.Scanner;

public class CharsToPrintSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 char");
        String w1 = input.next();
        String w2 = input.next();

        char ch1 = w1.charAt(0);
        System.out.println(ch1);
        int inch1 = (int) ch1;
        System.out.println("inch1 = " + inch1);

        char ch2 = w2.charAt(0);
        System.out.println(ch2);
        int inch2 = (int) ch2;
        System.out.println("inch2 = " + inch2);

        System.out.println(inch1 + inch2);

        input.close();

        /*
        Get 2 inputs from users as char and print sum of them as integer.(Use ASCII table)
         */
    }
}
