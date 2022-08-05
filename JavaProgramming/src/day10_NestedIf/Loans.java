package day10_NestedIf;

public class Loans {

    public static void main(String[] args) {

        double salary = 70000;
        int creditScore = 400;

        String result = (salary > 60000 && creditScore > 650)? "Loan Approved" : "Loan Denied";

        System.out.println(result);
    }

}
