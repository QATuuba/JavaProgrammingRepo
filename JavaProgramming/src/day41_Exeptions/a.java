package day41_Exeptions;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a {


        public static boolean isAnagram(String word1, String word2) {

            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();

            ArrayList list1 = new ArrayList<>();
            ArrayList list2 = new ArrayList<>();

            for (int i = 0; i < word1.length(); i++) {

            }


            boolean isAnAnagram = false;

            char[] char1 = word1.toCharArray();
            char[] char2 = word2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            char[] temp1 = {};
            char[] temp2 = {};

            for (int i = 0, j = 0; i < char1.length; i++, j++) {
                if (char1[i] == ' ') {
                    continue;
                }else {
                    temp1[j] = char1[i];
                }
            }

            for (int i = 0, j = 0; i < char2.length; i++, j++) {
                if (char2[i] == ' ') {
                    continue;
                }else {
                    temp2[j] = char2[i];
                }
            }

            return Arrays.equals(temp1,temp2);

        }

        // Do not touch below


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(isAnagram(in.nextLine(), in.nextLine()));
        }

    }
/*
**_Anagram_** is a word, phrase, or name formed by rearranging the letters of another, such as _cinema_, formed from _iceman_.



The **isAnagram** method checks if word1 and word2 are anagram to each other then return a boolean.

- each letter in `word1` should appear in `word2` exact number of times
- ignore empty spaces
- make your code case insensitive

Examples:

```
isAnagram("listen", "Silent") ==> true
```

```
isAnagram("earth", "heart") ==> true
```

```
isAnagram("star", "rats") ==> true
```

```
isAnagram("hi", "bye") ==> false
```

```
isAnagram("java", "cava") ==> false
```

 */