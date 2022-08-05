package day11_Switch_Scanner;

public class GradeReport {

    public static void main(String[] args) {

        char number = 'B';
        String result = "";

        switch (number) {

            case 'A':
                result = "Excellent";
                break;

            case 'B':
                result = "Great";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";

            default:
                result = "Invalid";

        }

        System.out.println(result);

    }

}
