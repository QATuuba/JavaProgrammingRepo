package day20_Arrays;

import java.util.Arrays;

public class MaxNumberOfArray2 {

    public static void main(String[] args) {

        int[] a = { 2, 5, 3, 7, 8};
        Arrays.sort(a);

        int max = a[a.length-1];
        System.out.println(max);
    }

}
