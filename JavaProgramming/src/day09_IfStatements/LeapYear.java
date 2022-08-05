package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean leapyear = year % 4 ==0;

        if (leapyear){
            System.out.println("Year " + year + " is a leap year");
        }else{
            System.out.println("Year " + year + " is NOT a leap year");
        }

    }

}
