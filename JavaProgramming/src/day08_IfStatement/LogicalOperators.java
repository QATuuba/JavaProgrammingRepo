package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 14;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("__________________________________");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan " + isEligible2);

        System.out.println("_______________________________-");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 > 18 && (gender == 'M' || gender == 'F');
        //                     21>=18   && 'F' == 'M'
        //                      true && (false || true)
        //                       true && true
        //                          true

        System.out.println(name3 + " is eligible to register: " + isEligible3);

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUsCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUsCitizen == true;
        //                        false || false
        //                          false

        System.out.println(name4 + " is eligible to apply for USA citizenShip: " + isEligible3);

        System.out.println("________________________");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for the scholar ship " + isEligible5);

        System.out.println("______________________________");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("_______________________");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }

}
