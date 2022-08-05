package day27_WrapperClasses;

import java.util.Arrays;

public class SwapTask {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] swap = swapElements(arr, 2,4);
        System.out.println(Arrays.toString(swap));

        char[] ch = {'a','b','c','d'};
        char[] swapChar = swapElements(ch,1,3);
        System.out.println(Arrays.toString(swapChar));

    }

    public static int[] swapElements(int[] array, int i, int j){

        int[] result = new int[array.length];
        for (int k = 0; k < array.length; k++) {
            result[k] = array[k];
            if (k == i){
                result[i] = array[j];
            }
            if (k == j){
                result[j] = array[i];
            }
        }
        return result;
    }

    public static double[] swapElements(double[] array, int i, int j){

        double[] result = new double[array.length];
        for (int k = 0; k < array.length; k++) {
            result[k] = array[k];
            if (k == i){
                result[i] = array[j];
            }
            if (k == j){
                result[j] = array[i];
            }
        }
        return result;
    }

    public static char[] swapElements(char[] array, int i, int j){

        char[] result = new char[array.length];
        for (int k = 0; k < array.length; k++) {
            result[k] = array[k];
            if (k == i){
                result[i] = array[j];
            }
            if (k == j){
                result[j] = array[i];
            }
        }
        return result;
    }

    public static String[] swapElements(String[] array, int i, int j){

        String[] result = new String[array.length];
        for (int k = 0; k < array.length; k++) {
            result[k] = array[k];
            if (k == i){
                result[i] = array[j];
            }
            if (k == j){
                result[j] = array[i];
            }
        }
        return result;
    }

}
