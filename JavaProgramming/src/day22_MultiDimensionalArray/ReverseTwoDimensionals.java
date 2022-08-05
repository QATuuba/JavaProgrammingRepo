package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseTwoDimensionals {

    public static void main(String[] args) {

        int[][] array2D = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
        int[][] reversed2d = new int[array2D.length][];

        for (int i = array2D.length-1, j = 0; i >= 0; i--, j++) {

            int[] tempArray = new int[array2D[i].length];
            for (int k = array2D[i].length - 1, m = 0; k>=0; k--, m++) {
                tempArray[m] = array2D[i][k];
            }

            reversed2d[j] = tempArray;
        }

        System.out.println(Arrays.deepToString(reversed2d));

    }

}
/*
    Write a program that can reverse a two-dimensional array (return new array)
		Ex:
                array = { {1,2,3}, {4,5,6}};


                output:
                reverse = { {6,5,4}, {3,2,1},};

 */