package day19_LoopPractices;

import java.sql.PreparedStatement;

public class TheHighestFrequency {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        int highestFrequency = 0;

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (ch == each){
                    count++;
                }

            }
            if (count > highestFrequency) {
                highestFrequency = count;
            }

        }

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each){
                    count++;
                }
            }

            if (count == highestFrequency && !result.contains("" + ch)){
                result+= ch;
            }
        }
        System.out.println(result);
    }

}
