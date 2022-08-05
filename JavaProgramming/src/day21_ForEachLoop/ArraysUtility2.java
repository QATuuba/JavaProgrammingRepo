package day21_ForEachLoop;

import javax.print.DocFlavor;
import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String [] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3);


        //String [] earlyBirds = Arrays.copyOf(students,15);//[Elif, Sinem, Gunay, Cihad, David, James, Aaron,
                                                                    // Daniel, null, null, null, null, null, null, null]
        System.out.println(Arrays.toString(earlyBirds));// [Elif, Sinem, Gunay]

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers,5);//{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));

        System.out.println("____________________________");

        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6);

        System.out.println(Arrays.toString(ch2));// [C, D, E, F]

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        //index of   =  1  2  3  4  5  6  7  8  9  10
        int[] result = Arrays.copyOfRange(scores, 3,7+1);//3 is included but 7 is NOT included

        System.out.println(Arrays.toString(result));//[40, 50, 60, 70, 80]

        int[] result2 = Arrays.copyOfRange(scores,5,scores.length);//[60, 70, 80, 90, 100]
        System.out.println(Arrays.toString(result2));

    }

}
