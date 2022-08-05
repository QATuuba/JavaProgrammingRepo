package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        //username: "Cydeo"
        //password: "Cydeo123"


        //while(invalid && hasAttempts)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name:");
        String userName = scan.nextLine();

        System.out.println("Enter your password:");
        String password = scan.nextLine();


        if (userName.equalsIgnoreCase("Cydeo") && password.equalsIgnoreCase("Cydeo123")) {

        } else {
            int attempt = 3;
            while (!(userName.equalsIgnoreCase("Cydeo") && password.equalsIgnoreCase("Cydeo123")) && attempt > 0) {
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your user name:");
                userName = scan.nextLine();
                System.out.println("Enter your password:");
                password = scan.nextLine();
                attempt--;
            }

        }

        if ((userName.equalsIgnoreCase("Cydeo") && password.equalsIgnoreCase("Cydeo123"))){
            System.out.println("Logged in");
        }else {
            System.err.println("Your account is locked.");
        }
    scan.close();

    }

}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */