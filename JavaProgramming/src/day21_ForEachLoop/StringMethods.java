package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";

       // for (char each : str.toCharArray()){
         //   System.out.println(each);
        //}


        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));//[J, a, v, a]


        for (char each : chars){
            System.out.println(each);//J
                                     //a
                                     //v
                                     //a

        }

        System.out.println("___________________________");

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");//[Wooden, Spoon]

        System.out.println(Arrays.toString(words));

        System.out.println("_____________________");

        String email = "Woodenspoon@cydeo.com";

        String [] array = email.split("@");//[Woodenspoon, cydeo.com]

        System.out.println(Arrays.toString(array));

        System.out.println("_______________________");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String [] sentences = s.split("\\.");//only for dot, you have to put double backwards slash (\\) before the dot. The others you don't need anything

        System.out.println(Arrays.toString(sentences));//[Today is nice day,  Today is Monday,  Today we learn Java]


    }

}
