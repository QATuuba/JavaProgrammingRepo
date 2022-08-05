package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your Street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.next();

        System.out.println("Enter your zip code: ");
        int zipCode = input.nextInt();

        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

        input.close();

    }

}
 /*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( next() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */