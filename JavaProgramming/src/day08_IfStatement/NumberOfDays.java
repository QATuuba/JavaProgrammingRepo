package day08_IfStatement;

public class NumberOfDays {

    public static void main(String[] args) {

        int n = 5;

    boolean has28Days = n == 2;
    boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;
    boolean has31Days = !has28Days && !has30Days;

    if (has28Days){
        System.out.println("It has 28 days");
    }
    if (has30Days){
        System.out.println("It has 30 days");
    }
    if (has31Days){
        System.out.println("It has 31 days");
    }

    }

}
