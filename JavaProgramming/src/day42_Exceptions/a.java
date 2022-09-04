package day42_Exceptions;


import day12_Scanner.Scanner3;
import day14_String.StringMethod2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a {

    public static void main(String[] args) {

        System.out.println(method3(50));

    }

    public static String method3(int num){
        if (num<0){
            return "0";
        }else if (num < 50){
            return "50";
        } else if (num < 100) {
            return "100";
        }else{
            return "other";
        }

    }


}


