package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {

    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index" + index);
            System.exit(0);
        }

        int[] result = {};
        for (int i = 0; i < array.length; i++) {//i = array's index number
            if (i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }

        return result;

    }

}
