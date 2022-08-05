package day30_CustomClass;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class a {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }



    public static String[] getWithE(String[] arr) {

        String[] fewValues = {};
        int i = 0;
        for (String each : fewValues) {
                char[] ch = new char[each.length()];
                ch[i] += each.charAt(i);

                fewValues[i] += each;
                i++;


        }

        return fewValues;
    }



}
