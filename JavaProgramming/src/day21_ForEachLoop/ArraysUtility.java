package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);//hashcode  [I@58ceff1
        System.out.println(Arrays.toString(nums));//[1, 2, 3, 4, 5]

        System.out.println(nums[0]);//1

        System.out.println("_________________________");

        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);//{55......100}

        System.out.println(Arrays.toString(scores));//[55, 65, 78, 85, 95, 100]

        System.out.println("Min Score: " + scores[0]);
        System.out.println("Max Number: " + scores[scores.length - 1]);

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] words = {"Anna", "ANNA"};// upper cases char value is smaller than lower cases

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));//{"ANNA", "Anna"}

        System.out.println("___________________________");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2);

        System.out.println("____________________");

        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println(anagram);



    }

}
