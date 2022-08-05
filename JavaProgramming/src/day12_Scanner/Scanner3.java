package day12_Scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();//reads the input until a space, you can use _

        System.out.println("Name = " + name);

        input.close();


        System.out.println("___________________");


    }

}
