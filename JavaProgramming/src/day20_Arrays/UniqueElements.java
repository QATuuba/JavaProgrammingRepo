package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int j = 0; j < words.length; j++) {

            String element = words[j];//"Java"
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equalsIgnoreCase(element)) {
                    count++;
                }
            }
            if (count == 1)
                System.out.println(element);
        }

    }

}
