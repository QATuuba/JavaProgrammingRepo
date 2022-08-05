package day23_CustomMethods_Void;

public class CustomEligibleAlcohol {

    public static void main(String[] args) {

        eligibleAlcohol(30);

    }

    public static void eligibleAlcohol(int age){

        if (age >= 20){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are NOT eligible to buy alcohol");
        }

    }

}
