package day10_NestedIf;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 37;

        String result = "";

        if (age >= 0 && age <= 150){
            result = (age <21)? "Teenager" :(age >= 21 && age <55)? "Adult" : "Senior";
        }else {
            System.out.println("Invalid");
        }

        System.out.println(result);

    }

}
