package day27_WrapperClasses;

public class RetrieveTask {

    public static void main(String[] args) {


        String s = "Wooden Spoon!";
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (char each : s.toCharArray()) {
            if (Character.isLetter(each)) {
                letters += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {
                specialChars += each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }

}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"
		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */