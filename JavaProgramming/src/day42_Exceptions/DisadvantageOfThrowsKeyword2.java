package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        System.out.println("Hello");

        method1();
        method2();
        method3();

        String str = null;
        try {
            System.out.println(str.charAt(0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    public static void method(){
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws InterruptedException {

        //new FileInputStream("");
        Thread.sleep(3000);

        /*
        Exception in thread "main" java.io.FileNotFoundException:
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
	at day42_Exceptions.DisadvantageOfThrowsKeyword2.main(DisadvantageOfThrowsKeyword2.java:10)

Process finished with exit code 1
         */

    }

    public static void method2() throws InterruptedException {
        method1();
    }

    public static void method3() throws InterruptedException {
        method2();

        Thread.sleep(1000);
    }
    public static void method4() throws InterruptedException {
        method3();
    }

}
