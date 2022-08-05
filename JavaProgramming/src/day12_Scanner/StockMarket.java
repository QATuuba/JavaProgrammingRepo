package day12_Scanner;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many total shares you have already?: ");
        int share = input.nextInt();

        if (share > 0) {

            System.out.println("How much your total value in the stock market is; ");
            double totalValue = input.nextDouble();

            input.nextLine();

            System.out.println("Enter the name of company you have the most shares in; ");
            String companyName = input.nextLine();

            System.out.println("Your total stock market holding is $" + totalValue + " which is made up of " + share + " shares. " + companyName + " is your company holdings");
        }

        input.close();

/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight.
 Declare boolean variable: isMarried (for marriage status). Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

 // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
     // continue for cit
 */

       /* Welcome to the patient portal!
                Please enter your personal information
        Enter your first name
        Enter your last name
        Enter your email
        Enter your street
        Enter your city
        Enter your state
        Enter your zip code
        Enter your work phone number
        Enter your personal phone number
        Enter your age
        Enter your height
        Enter your weight
        Are you married?
                Patient personal information
        Full name: Tyson, Mike
        Address: 7911 Westpark Dr, McLean, VA 22102
        Contacts: work phone number - 7896542315, personal phone number - 2406542315, email: miketyson@gmail.com
        Age: 45
        Height: 6.1
        Weight: 175.2 pounds
        Married?: false
*/

    }

}
 /*   StockMarket task:
        - Ask the user how many total shares they have already? (int)
        -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
        Ex:
        inputs: 100, 25000, Apple INC

        "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
*/