package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 135;

        String result = (score >= 0 && score <= 100)? (score >= 90)? "Excellent" :(score >= 80)? "Great"
                :(score >= 70)? "Good" :(score >= 60)? "Passed" : "Failed" : "Invalid";

        System.out.println(result);

        String result2 = "";

        if (score >= 0 && score <= 100) {
            result2 = (score >= 90)? "Excellent" :(score >= 80)? "Great" :(score >= 70)? "Good"
                    :(score >= 60)? "Passed" : "Failed";
        }else {
            System.out.println("Invalid");
        }
        System.out.println(result2);

    }

}
