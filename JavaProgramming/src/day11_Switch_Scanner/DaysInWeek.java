package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 5;
        //long number = 5L; it gives complainer
        //float number = 5f; it gives complainer
        //double number = 5; it gives complainer
        //boolean number = true; it gives complainer

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;//exits in the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;//exits in the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break;//exits in the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break;//exits in the switch after executing the case block

            case 5:
                System.out.println("Friday");
                break;//exits in the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                break;//exits in the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                break;//exits in the switch after executing the case block

            default:
                System.out.println("Invalid");
                break;

        }
        System.out.println("___________________________");

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;//exits in the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;//exits in the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break;//exits in the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break;//exits in the switch after executing the case block

            case 5:
                System.out.println("Friday");
                //break;//exits in the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                break;//exits in the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                break;//exits in the switch after executing the case block

            default:
                System.out.println("Invalid");
                break;//it's not mandatory because there is a curly bracket after default

        }

        System.out.println("___________________________");

        switch (number) {
            case 1:
                System.out.println("Monday");
                //break;//exits in the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                //break;//exits in the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                //break;//exits in the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                //break;//exits in the switch after executing the case block

            case 5:
                System.out.println("Friday");
                //break;//exits in the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                //break;//exits in the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                //break;//exits in the switch after executing the case block

            default:
                System.out.println("Invalid");
                //break;

        }

        System.out.println("___________________________");

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;//exits in the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;//exits in the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break;//exits in the switch after executing the case block

            default:
                System.out.println("Invalid");
                break;

            case 4:
                System.out.println("Thursday");
                break;//exits in the switch after executing the case block

            case 5:
                System.out.println("Friday");
                break;//exits in the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                break;//exits in the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                break;//exits in the switch after executing the case block



        }

    }

}
