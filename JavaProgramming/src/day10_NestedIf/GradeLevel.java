package day10_NestedIf;

public class GradeLevel {

    public static void main(String[] args) {

        int grade = 15;
        String result = "";

        if (grade >= 1 && grade <= 18) {
            result = (grade >= 1 && grade <= 5) ? "Elementary School" : (grade >= 6 && grade <= 8) ? "Middle School"
                    : (grade >= 9 && grade <= 12) ? "High School"
                    : (grade >= 13 && grade <= 16) ? "Collage" : "Grad School";
        } else {
            System.out.println("Invalid");
        }

        System.out.println(result);

    }

}
