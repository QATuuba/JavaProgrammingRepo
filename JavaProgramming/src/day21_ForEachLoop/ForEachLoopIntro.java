package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {  // it's long and you need to worry about iteration, initilation.....
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

        System.out.println("_______________________");

        for (int each : numbers){             //it's faster and easy
            System.out.println(each);
        }

    }

}
