package day23_CustomMethods_Void;

public class CustomPositiveNegativeZero {

    public static void main(String[] args) {

        positiveNegativeZero(-6);

    }

    public static void positiveNegativeZero(int number){

        if (number> 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        }else {
            System.out.println(number + " is zero");
        }

    }

}
