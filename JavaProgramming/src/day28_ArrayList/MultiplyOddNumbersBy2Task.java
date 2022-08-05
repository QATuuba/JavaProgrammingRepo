package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbersBy2Task {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> time2 = new ArrayList<>();

        for (Integer each : list) {
            if (each%2 == 1) {
                each = each*2;
            }
            time2.add(each);
        }

        System.out.println(time2);

    }

}
/*
 write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
 */