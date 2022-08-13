package day41_Exeptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exception
        int a = 10;
        int b = 0;

        /*
        System.out.println( a/b );//Exception in thread "main" java.lang.ArithmeticException: / by zero
                                  //at day41_Exeptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:11)
        System.out.println("Wooden Spoon");

         */

        char[] characters = {'A', 'B', 'C'};
        //                    0    1    2

        /*
        System.out.println(characters[99]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3
                                           //at day41_Exeptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:21)

                                           //Process finished with exit code 1

         */

        Student student = null;

        /*
        System.out.println(student.getName());//Exception in thread "main" java.lang.NullPointerException
                                              //at day41_Exeptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:33)

                                              //Process finished with exit code 1

         */
        String str = "Wooden Spoon";
        //str = null;

        System.out.println(str.toUpperCase());//.NullPointerException

        String str2 = "";// object != null

        System.out.println(str2.isEmpty());

        //checked exception:

        System.out.println("Hello");

        //Thread.sleep(3000);

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file");
        System.out.println("Java".charAt(1000)); // unchecked



    }

}
