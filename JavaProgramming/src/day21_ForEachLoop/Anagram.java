package day21_ForEachLoop;

public class Anagram {

    public static void main(String[] args) {

        // write a program that can check if str1 & str2 are build out same characters

        String str1 = "acbd";
        String str2 = "dbca";

        boolean hasSameCharacters = false;

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        for (char each1 : char1){
            for (char each2 : char2){
                if (each1==each2){
                    hasSameCharacters = true;
                }

            }

        }
        System.out.println(hasSameCharacters);


    }

}
