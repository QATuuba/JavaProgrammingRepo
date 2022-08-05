package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReturnMethodsPractice3 {

    public static void main(String[] args) {

    //
    String str = "aabccdee";
    char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));


    }

    public static int frequency(String str, char ch){

        int count = 0;

        for (char each : str.toCharArray()){
            if(each == ch){
                count++;
            }
        }
return count;
    }



}
