package day16_ForLoopStringPractice;

import javax.print.attribute.standard.PresentationDirection;

public class FrequencyOfDogAndCat {

    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt";

        int frequencyOfCat = 0;
        int frequencyOfDog = 0;

        for (int i = 0; i <= (sentence.length()-3); i++) {
            String s = sentence.substring(i, i + 3);

            if (s.equalsIgnoreCase("cat")) {
                frequencyOfCat++;
            }
            if (s.equalsIgnoreCase("dog")) {
                frequencyOfDog++;
            }

        }
            boolean result = frequencyOfCat == frequencyOfDog;

            System.out.println(result);


    }

}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence
	        Ex:
	            sentence = "caT dog dogG cAt"
	            output:
	                true
 */