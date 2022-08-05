package day23_CustomMethods_Void;

public class CustomPrintEachElement {

    public static void main(String[] args) {

        int[] array = {10, 5, 4, 20, 1, 0};

        printEachElement(array);

    }

    public static void printEachElement(int[] array){

        for (int i : array) {
            System.out.print(i + " - ");
        }

    }

}
