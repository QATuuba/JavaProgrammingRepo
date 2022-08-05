package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? Yes/No");

        String answer = scan.next();
        int king = 120;
        int queen = 100;
        int single = 80;

        while (!(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("yes" ))){
            System.out.println("Please re-entry such as Yes/No");
            answer = scan.next();
        }

        if (answer.equalsIgnoreCase("no")){
            System.out.println("Have a nice day");
        }

        while (answer.equalsIgnoreCase("yes")){
            System.out.println("Which type of room do you want to reserve? King Bed/Queen Bed/Single Bed");
            answer = scan.nextLine();

            while (!(answer.equalsIgnoreCase("King Bed") || answer.equalsIgnoreCase("Queen Bed") || answer.equalsIgnoreCase("Single Bed"))){
                System.out.println("Which type of room do you want to reserve? King Bed/Queen Bed/Single Bed");
                answer = scan.nextLine();
            }

            if (answer.equalsIgnoreCase("King Bed")){
                System.out.println("You have reserved a King Bed room and total price of the room is :" + king + "$");
            } else if (answer.equalsIgnoreCase("Queen Bed")) {
                System.out.println("You have reserved a Queen Bed room and total price of the room is :" + queen + "$");
            } else if (answer.equalsIgnoreCase("Single Bed")) {
                System.out.println("You have reserved a Single Bed room and total price of the room is :" + single + "$");
            }



        }

    }

}
/*
5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$
            the program should be able to display the room he/she reserved and total price of the room.
            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */