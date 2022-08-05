package day14_String;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();

        System.out.println("Enter your email address");
        String emailAddress = scan.nextLine();


        if (emailAddress.equals(firstName + "_" +lastName + "@gmail.com")){
            System.out.println(lastName + "_" + firstName + "@gmail.com");
        }else {
            System.out.println(emailAddress);
        }

    }

}
