package day23_CustomMethods_Void;

import java.util.Locale;

public class CustomPrintFullName {

    public static void main(String[] args) {

printOutTheFullName("cYdEo", "SCHOOL");

    }

    public static void printOutTheFullName(String firstName, String lastName){

        String fullName = firstName + " " + lastName;
            fullName = fullName.toLowerCase(Locale.ROOT);
            fullName= fullName.replaceFirst("c","C");
            fullName = fullName.replaceFirst("s", "S");
            System.out.println(fullName);


    }

}
