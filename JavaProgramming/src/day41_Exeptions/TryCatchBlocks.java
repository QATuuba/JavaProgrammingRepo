package day41_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Test started");

        try{

            System.out.println(9/0);
            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception was occured");

        }


        System.out.println("Test completed");

        System.out.println("-------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try{

            System.out.println(numbers[200]);

            System.out.println("Try block");

        }catch (ArrayIndexOutOfBoundsException e){// or if you don't know that exception is which class, you can write
                                                  // (RuntimeException e) because it's the parent of all unchecked exception classes
/*
            System.out.println("Catch Block");

            System.out.println("Run time exception was occured");

 */

            //e.printStackTrace();//full details
            /*
        Test2 started
Test2 completed
java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5
	at day41_Exeptions.TryCatchBlocks.main(TryCatchBlocks.java:32)
	*/

            System.out.println(e.getMessage());//gives a brief
            /*
            Test2 started
Index 200 out of bounds for length 5
Test2 completed
             */

        }


        System.out.println("Test2 completed");

        System.out.println("--------------------");

        System.out.println("Test3 started");

        try {

            System.out.println("Cydeo".substring(2,0));

        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test3 completed");

        System.out.println("Test4 started");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("Cydeo");

        System.out.println("------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
