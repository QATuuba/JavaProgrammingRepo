package day20_Arrays;

import java.util.Arrays;

public class Letters {

    public static void main(String[] args) {

        char[] letters = new char[26];

//        for (int i = 0, j = 'A'; (i < letters.length) && (j <= 'Z'); i++, j++) {//i: index numbers 0 ~ last index
//             letters[i] = (char) j;
//        }

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;// or you can write it that: letters[i] = ch
                               //                           ch++;
        }


        System.out.println(Arrays.toString(letters));


        System.out.println("__________________");
        char[] letters2 = new char[26];// [Z ~ A]

        //char ch2 = 'A';                                         You can use this way or under way
        //for (int i = letters2.length - 1; i >= 0; i--) {
        //    letters2[i] = ch2;
        //    ch2++;
        //}

        char ch2 = 'Z';
        for (int i = 0; i <= letters2.length - 1; i++) {
            letters2[i] = ch2;
            ch2--;
        }


        System.out.println(Arrays.toString(letters2));
    }



}
