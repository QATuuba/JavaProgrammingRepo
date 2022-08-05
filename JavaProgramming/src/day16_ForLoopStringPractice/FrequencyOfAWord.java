package day16_ForLoopStringPractice;

public class FrequencyOfAWord {

    public static void main(String[] args) {

        String str = "Java Java";

        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) {
            String s = str.substring(i,i+4);
            if (s.equalsIgnoreCase("java"))
            frequency++;
        }

        System.out.println(frequency);
    }

}
