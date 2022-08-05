package day27_WrapperClasses;

import java.util.Arrays;

public class InsertTask {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        int[] insert = insert(array,2,100);
        System.out.println(Arrays.toString(insert));

        double[] array1 = {10.0, 20.1, 30.2, 40.3, 50.4};
        double[] insert1 = insert(array1,2,100.5);
        System.out.println(Arrays.toString(insert1));


    }

    public static int[] insert(int[] array, int index, int element){

        if (index<0||index>= array.length){
            System.err.println("Invalid Index: " + index );
            System.exit(0);
        }

        int[] result = new int[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i==index){
                j++;
            }
            result[j] = array[i];
        }


        return result;
    }

    public static double[] insert(double[] array, int index, double element){

        if (index<0||index>= array.length){
            System.err.println("Invalid Index: " + index );
            System.exit(0);
        }

        double[] result = new double[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i==index){
                j++;
            }
            result[j] = array[i];
        }


        return result;
    }

    public static char[] insert(char[] array, int index, char element){

        if (index<0||index>= array.length){
            System.err.println("Invalid Index: " + index );
            System.exit(0);
        }

        char[] result = new char[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i==index){
                j++;
            }
            result[j] = array[i];
        }


        return result;
    }

    public static String[] insert(String[] array, int index, String element){

        if (index<0||index>= array.length){
            System.err.println("Invalid Index: " + index );
            System.exit(0);
        }

        String[] result = new String[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i==index){
                j++;
            }
            result[j] = array[i];
        }


        return result;
    }

}
/*
Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */