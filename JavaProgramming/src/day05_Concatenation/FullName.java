package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Tugba";
        String lastName = "Duran";
        int age = 37;
        String jobTitle = "SDET";
        double salary = 100000.58;
        String companyName = "Apple Inc";

        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName);

        // ____ is __ years old.

        System.out.println(fullName + " is " + age + " years old.");

        //Full name is jobTitle, works at CompanyName, and fullName' salary is salary

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and " + fullName + "'s salary is $" + salary);


    }

}
