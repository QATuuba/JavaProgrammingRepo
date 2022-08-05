package day10_NestedIf;

public class CrewAndPassengers {

    public static void main(String[] args) {

        int total = 75;

        String result = "";

        if (total <=100 && total >= 50){
            result = (total == 50)? "20 crew, 30 passengers" :(total == 75)? "25 crew, 50 passengers" : "30 crews, 70 passengers";
        }else {
            System.out.println("Invalid");
        }

        System.out.println(result);

    }

}
