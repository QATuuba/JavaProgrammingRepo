package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        //student name & score

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Maria", 95);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkay", 97);
        students.put("Andriy", 98);

        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87);

        System.out.println(students);
        System.out.println(students.size());

        //display the score of Alex
        System.out.println(students.get("Alex"));

        //replace Ali's score to 90
        students.replace("Ali", 90);
        System.out.println(students);

        students.remove("Alex");
        System.out.println(students);

        students.remove("Ozan");
        System.out.println(students);

        boolean r1 = students.containsKey("Muhtar");//false
        System.out.println(r1);

        boolean r2 = students.containsKey("Serkay");//true
        System.out.println(r2);

        boolean r3 = students.containsValue(100);//false
        System.out.println(r3);

        boolean r4 = students.containsValue(90);//true
        System.out.println(r4);

        System.out.println(students.isEmpty());//false

        System.out.println("------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);


        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 == map2);//false
        System.out.println(map1.equals(map2));//true

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);

    }


}
