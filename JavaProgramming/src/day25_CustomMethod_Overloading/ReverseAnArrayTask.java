package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class ReverseAnArrayTask {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};
        int[] reverse = reverseAnArray(array);
        System.out.println(Arrays.toString(reverse));

        String[] arr = {"Ali", "Veli", "Ahmet", "Mehmet"};
        String[] reverse1 = reverseAnArray(arr);
        System.out.println(Arrays.toString(reverse1));

    }

    public static int[] reverseAnArray(int[] array){

        int[] result = new int[array.length];
        for (int i = array.length - 1, j= 0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    public static double[] reverseAnArray(double[] array){

        double[] result = new double[array.length];
        for (int i = array.length - 1, j= 0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    public static char[] reverseAnArray(char[] array){

        char[] result = new char[array.length];
        for (int i = array.length - 1, j= 0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

    public static String[] reverseAnArray(String[] array){

        String[] result = new String[array.length];
        for (int i = array.length - 1, j= 0; i >= 0; i--,j++) {
            result[j] = array[i];
        }
        return result;
    }

}
