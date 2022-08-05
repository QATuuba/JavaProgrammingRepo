package day26_CustomMethodsPractice;

import java.util.Arrays;

import static utilities.ArraysUtility.addElement;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        int[] arr3 = merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        //int[] result = new int[arr1.length + arr2.length];
        int[] result = {};

        for (int each : arr1) {
            result = addElement(result, each);
        }

        for (int each : arr2) {
            result = addElement(result, each);
        }

        return result;
    }

    public static int[] merge1(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;

        }

        return result;

    }
}
