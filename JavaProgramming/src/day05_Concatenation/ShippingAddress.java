package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Tugba",
                buildingNumber = "11821B",
                streetName = "Cedar Road",
                city = "london",
                state = "England",
                zipCode = "SM25FR";

        //System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);


    }

}
