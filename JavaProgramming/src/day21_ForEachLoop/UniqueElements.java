package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        int count = 0;

        for (String each : words) {

            for (String element : words) {
                if (element.equals("Layan")) {
                    count++;
                }
                if (count==1){
                    System.out.println(each);
            }


            }

        }

    }

}
