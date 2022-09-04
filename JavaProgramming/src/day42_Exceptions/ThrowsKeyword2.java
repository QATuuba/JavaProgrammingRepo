package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws ArithmeticException{

        System.out.println("Test started");

        System.out.println(8/0);

        System.out.println("Test completed");
        /*
        Test started
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day42_Exceptions.ThrowsKeyword2.main(ThrowsKeyword2.java:9)
         */

    }

}
