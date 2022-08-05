package day23_CustomMethods_Void;

public class CustomGrades {

    public static void main(String[] args) {

        grades(74);

    }

    public static void grades(int score){

        if (score >= 0 && score <= 100){
            if (score >= 90){
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score <= 60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else {
            System.out.println("Invalid Score");
        }

    }

}
