package day14_String;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email address");
        String emailAddress = scan.nextLine();

        String firstName = emailAddress.substring(0,emailAddress.indexOf("_"));


        String lastName = emailAddress.substring(emailAddress.indexOf("_") +1, emailAddress.indexOf("@"));
        String domain = emailAddress.substring(emailAddress.indexOf("@") +1, emailAddress.indexOf("."));

        System.out.println("First Name: " + firstName.substring(0,1).toUpperCase() + firstName.substring(1));
        System.out.println("Last Name: " + lastName.substring(0,1).toUpperCase() + lastName.substring(1));
        System.out.println("Domain: " + domain);


    }

}
