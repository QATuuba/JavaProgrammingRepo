package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int price = 0;


        while (true) {

            System.out.println("Which bedroom do you want to reserve?");
            System.out.println("King Bed == $120");
            System.out.println("Queen Bed == $100");
            System.out.println("Single Bed == $80");

            String bedroom = scan.nextLine().toLowerCase();

            System.out.println("How many nights will you stay?");
            int night = scan.nextInt();

            while (!(bedroom.equals("king bed") || bedroom.equals("queen bed") || bedroom.equals("single bed"))) {
                System.out.println("Invalid Entry, Please Re-Enter");
                bedroom = scan.nextLine().toLowerCase();
            }
            price += (bedroom.equalsIgnoreCase("King Bed"))? 120 : (bedroom.equalsIgnoreCase("Queen Bed"))? 100 : 80;

            System.out.println("Would you like to reserve another room?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Please re-enter, Would you like to reserve another room?");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Your total price is: $" + price)
                ;break;
            }

            System.out.println("Total price is " + night*price);

            scan.nextLine();
        }

    }

}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price
            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */