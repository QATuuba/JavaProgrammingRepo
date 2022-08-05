package day33_Statics;

public class AddressTask {

    public String street, city, state, zipCode;

    public static String country, planet;

    public AddressTask(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return street+ "\n" + city + " " + state + ", " + zipCode;
    }
}
