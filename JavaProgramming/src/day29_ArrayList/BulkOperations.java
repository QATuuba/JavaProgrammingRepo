package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,5,5,5,5,5,8,8,8,8,8));

        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println("list = " + list);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        System.out.println("numbers = " + numbers);

        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println("numbers = " + numbers);

        System.out.println("---------------------");
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

        System.out.println("-----------------------------");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums. contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));//if you give only 1 false number, it will print false


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("----------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Brenna"};

        ArrayList<String> nameList = new ArrayList<>();
        //nameList.addAll(names) = it gives error

        nameList.addAll(Arrays.asList(names));
        System.out.println("nameList = " + nameList);

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println("namesList = " + namesList);

        System.out.println("-------------------------------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));  because of it,s primitive it gives error

        Integer[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arr2));
        System.out.println("list3 = " + list3);

        System.out.println("--------------------------------------");
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list4 = new ArrayList<>(convertArrayToArrayList(arr3));
        System.out.println("list4 = " + list4);

    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;

    }

}
