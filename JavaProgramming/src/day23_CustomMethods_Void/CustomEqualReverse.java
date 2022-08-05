package day23_CustomMethods_Void;

public class CustomEqualReverse {

    public static void main(String[] args) {

equalReverse("kaya", "ayak");

    }

    public static void equalReverse(String string1, String string2){

        StringBuilder reverse = new StringBuilder(string2);

        String reverse2 = reverse.reverse().toString();

        if (string1.equalsIgnoreCase(reverse2)){
            System.out.println(string1 + " and " + string2 + " are equal");
        }else {
            System.out.println(string1 + " and " + string2 + " are NOT equal");
        }

    }

}
