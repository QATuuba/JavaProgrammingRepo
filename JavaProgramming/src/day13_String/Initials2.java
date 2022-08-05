package day13_String;

public class Initials2 {

    public static void main(String[] args) {

        String s1 = "Cybertek";
        String s2 = "school";

        s2 = s2.toUpperCase();

        char f1 = s1.charAt(0);
        char f2 = s2.charAt(0);

        System.out.println(f1 + "." + f2);

    }

}
