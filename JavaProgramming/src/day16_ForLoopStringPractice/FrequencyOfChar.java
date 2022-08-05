package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string and a char");
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (ch == eachChar){
                frequency++;
            }

        }

        System.out.println(frequency);

    }

}
