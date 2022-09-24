package day52_Map_FuntionalInterface;

import java.util.*;

public class ExtraPractice {

    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();


        for (String each : arr) {

            int frequency = Collections.frequency(Arrays.asList(arr), each);

            result.put(each, frequency);

        }

        System.out.println(result);

        System.out.println("------------------------------");

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("java", "java", "python", "c#"));

        Map<String, Integer> result1 = new LinkedHashMap<>();

        int max = Integer.MIN_VALUE;

        for (String each : list) {

            int frequency = Collections.frequency(list, each);

            result1.put(each, frequency);

            if (frequency > max){
                max = frequency;
            }


        }


        System.out.println(result1);

        for (Map.Entry<String, Integer> eachEntry : result1.entrySet()) {
            if (eachEntry.getValue() == max){
                System.out.println(eachEntry.getKey() + " has the highest frequency");
            }
        }


    }



}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency


	Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency

 */