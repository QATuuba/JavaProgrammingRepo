package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> merge = new ArrayList<>(Arrays.asList());

        for (String each : arr1) {
            merge.add(each);
        }

        for (String each : arr2) {
            merge.add(each);
        }

        System.out.println(merge);
    }

}
/*
write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */