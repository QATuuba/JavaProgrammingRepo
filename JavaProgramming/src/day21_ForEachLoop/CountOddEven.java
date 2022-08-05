package day21_ForEachLoop;

import java.util.Arrays;

public class CountOddEven {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int evens = 0;
        int odds = 0;

        for (int each : arr) {
            if (each%2 == 0) {
                evens++;
            }else {
                odds++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("There are " + odds + " odd numbers and " + evens + " even numbers");

    }

}
/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */