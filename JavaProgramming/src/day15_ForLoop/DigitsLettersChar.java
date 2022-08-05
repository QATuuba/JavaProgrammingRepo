package day15_ForLoop;

public class DigitsLettersChar {
    public static void main(String[] args) {

        String str = "FGHY^&)45839hsj";

        String digits = "";
        String letters = "";
        String characters = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ( ch >= '0' && ch <= '9'){
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            }else {
                if (ch != ' ') {
                    characters += ch;
                }
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("characters = " + characters);

    }

}
/*
 5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */