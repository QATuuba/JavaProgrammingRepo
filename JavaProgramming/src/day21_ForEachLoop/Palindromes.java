package day21_ForEachLoop;

import java.util.Arrays;

public class Palindromes {

    public static void main(String[] args) {

        String[] words = {"anna", "level", "Java"};
        int count = 0;
        String[] reversed = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            reversed[i] = sb.reverse().toString();

            if (reversed[i].equals(words[i])){
                count++;
            }

        }
        System.out.println(count);
        System.out.println(Arrays.toString(reversed));
    }

}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */