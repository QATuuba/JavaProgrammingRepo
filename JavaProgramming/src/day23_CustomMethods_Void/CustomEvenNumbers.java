package day23_CustomMethods_Void;

public class CustomEvenNumbers {

    public static void main(String[] args) {

     evenNumbers();

    }

    public static void evenNumbers(){

        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0){
                System.out.print(i + " ");
            }
        }

    }

}
