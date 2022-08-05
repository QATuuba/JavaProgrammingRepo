package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = "";//12345
        String letters = "";// CydeoWoodenSpoon
        String chars = "";//!@#$%



        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (0 ~ last index)
            char ch = str.charAt(i); // ch:each character that we have in str

            if (ch >= '1' && ch <= '9'){//if the character is between '0' to '9' then it's digit
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {// if the character is between 'A' to 'Z' then it's letter
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {// if the character is between 'a' to 'z' then it's letter
                letters += ch;
            } else {
                if (ch != ' '){// if the character is neither digit nor letter, then it's special character
                    chars += ch; // if the special character is not a space
                }
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("chars = " + chars);
    }
}
