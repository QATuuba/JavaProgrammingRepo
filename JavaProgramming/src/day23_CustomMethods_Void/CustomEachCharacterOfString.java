package day23_CustomMethods_Void;

public class CustomEachCharacterOfString {

    public static void main(String[] args) {

        eachCharacterOfString("Wooden Spoon");

    }

    public static void eachCharacterOfString(String str){

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch + " ");
        }

    }

}
