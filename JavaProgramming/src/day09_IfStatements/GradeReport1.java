package day09_IfStatements;

public class GradeReport1 {

    public static void main(String[] args) {

        int score = 73;
        String result;

        if (score>=90){
            result = "Excellent";
        } else if (score < 90 && score >= 80) {
            result = "Great";
        } else if (score < 80 && score >= 70) {
            result = "Good";
        } else if (score < 70 && score >= 60) {
            result = "Passed";
        }else {
            result = "Failed";
        }

        System.out.println("result = " + result);


    }

}
