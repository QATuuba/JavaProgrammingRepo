package day23_CustomMethods_Void;

public class CustomOddNumbers {

    public static void main(String[] args) {

        oddNumbers();

    }

    public static void oddNumbers(){

        for (int i = 0; i <= 100 ; i++) {
            if (i%2 ==1) {
                System.out.print(i + " ");
            }
        }

    }


}
