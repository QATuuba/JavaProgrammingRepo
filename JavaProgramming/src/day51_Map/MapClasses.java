package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        hashMap.put(5, "Ahmed");
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, "Cihad");
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");

        System.out.println("hashMap = " + hashMap);
        //hashMap = {null=Hulya, 3=Jack, 20=George, 5=Ahmed, 6=null, 7=null, 40=Emma, 8=null, 10=Arthur}

        // System.out.println(hashMap.get());

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmed");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);
        //linkedHashMap = {10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Isabella, null=Hulya}

        Map<Integer,String> treeMap = new TreeMap<>();// Key can not be null, value can be null and duplicated
        treeMap.put(10,"Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmed");
        treeMap.put(5, "Isabella");
        //treeMap.put(null, "Hulya");//NullPointerException

        System.out.println("treeMap = " + treeMap);
        //treeMap = {3=Jack, 5=Isabella, 10=Arthur, 20=George, 40=Emma}

        Map<Integer,String> hashtable = new Hashtable<>();// key and value both can not null
        hashtable.put(10,"Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmed");
        hashtable.put(5, "Isabella");
        //hashtable.put(null, "Isabella");//NullPointerException

        System.out.println("hashtable = " + hashtable);
        //hashtable = {10=Arthur, 20=George, 40=Emma, 5=Isabella, 3=Jack}

        //   String str = null;
        // System.out.println(str.toUpperCase());

    }

}
/*
browser   chrome
url
username   cydeo
password  cydeo123
 */