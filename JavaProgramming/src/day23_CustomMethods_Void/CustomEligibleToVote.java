package day23_CustomMethods_Void;

public class CustomEligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(15,"UK");

    }

    public static void eligibleToVote(int age, String citizen){

        if (age >= 19 && citizen.equalsIgnoreCase("USA")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are NOT eligible to vote");
        }

    }

}
