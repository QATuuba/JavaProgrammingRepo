package day23_CustomMethods_Void;

public class CustomKgToLb {

    public static void main(String[] args) {
        kgToLb(20);
    }

    public static void kgToLb(double kg){

        double lbs = kg * 2.20;
        System.out.println(kg + " kg = " + lbs + "lbs");

    }

}
