package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("wooden","Spoon" );

        System.out.println("---------------------------");
        displayDomain("Cydeo.School@gmail.com");

        System.out.println("---------------------------");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            displayDomain(email);
        }

        System.out.println("---------------------------");
        nameOfTheMonth(7);

        System.out.println("-------------------");
        nameOfTheDays(1);

        System.out.println("-------------------");
        numberOfDaysInAMonth(2,2000);

    }
//1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName){

        firstName = firstName.toUpperCase();
        lastName = lastName.toUpperCase();
        char initial1 = firstName.charAt(0);
        char initial2 = lastName.charAt(0);

        System.out.println(initial1 + "." + initial2);

    }

//2. Create a method that can display the domain of the email
    public static void displayDomain(String email){

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(domain);

    }

//3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfTheMonth(int number){

        String result = "";

        if (number >= 1 && number <= 12) {// if the number is valid ( 1~ 12)
            if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "February";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            } else if (number == 10) {
                result = "October";
            } else if (number == 11) {
                result = "November";
            } else {
                result = "December";
            }
        } else {
            result = "Invalid";
        }

        System.out.println(result);

    }

//4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfTheDays(int number){

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

    }

//5. Create a method that can print how many days a month has
    public static void numberOfDaysInAMonth(int month, int year){
        String result = "";

        if (month >= 1 && month <= 12) {

            switch (month) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    result = "31 days";
                    break;

                case 2:
                    result = (year % 4 == 0)? "29 days" : "28 days";
                    break;

                default:
                    result = "30 days";


            }


        } else {
            System.out.println("Invalid");
        }

        System.out.println(result);
    }

//6. ageGroups
//    age groups are:
//    infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
//    Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
//    Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
//    Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
//    Senior Citizen (75 - 84),
//    Old Senior Citizen (85+)
    public static void ageGroups(int age){

        String result = "";

        if (age >= 0 && age <= 150){
            result = (age <21)? "Teenager" :(age >= 21 && age <55)? "Adult" : "Senior";
        }else {
            System.out.println("Invalid");
        }

        System.out.println(result);

    }

}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */