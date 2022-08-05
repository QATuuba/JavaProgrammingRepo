package day08_IfStatement;

public class NameOfTheDay {

    public static void main(String[] args) {

        int n = 6;

        boolean mon = n == 1;
        boolean tue = n == 2;
        boolean wed = n == 3;
        boolean thu = n == 4;
        boolean fri = n == 5;
        boolean sat = n == 6;
        boolean sun = n == 7;

        if (mon){
            System.out.println("It's Monday");
        }
        if (tue){
            System.out.println("It's Tuesday");
        }
        if (wed){
            System.out.println("It's Wednesday");
        }
        if (thu){
            System.out.println("It's Thursday");
        }
        if (fri){
            System.out.println("It's Friday");
        }
        if (sat){
            System.out.println("It's Saturday");
        }
        if (sun){
            System.out.println("It's Sunday");
        }

    }

}
