package day21_ForEachLoop;

import java.util.Arrays;

public class SortDescendingOrder {

    public static void main(String[] args) {

        int[] numbers = {28, 85, 27, 47, 98, 41, 9};

        Arrays.sort(numbers);
        int[] result = new int[numbers.length];
        int j = 0;

            for (int i = numbers.length - 1; i >= 0; i--) {
                result[j++] = numbers[i];
            }
        System.out.println(Arrays.toString(result));
    }

}
 //   Write a program that sort the array of integer in descending order