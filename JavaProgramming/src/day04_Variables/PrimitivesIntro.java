package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        System.out.println("");

        // age: 38 years old
        byte age = 38;
        // weight: 160 pounds
        // byte weight = 160; // 160 is out of byte' range
        // byte num = -129; // -129 is out of byte' range

        short y = 160; // 160 is within the range of short

        // salary: 100000 $
        // short salary = 100000; 100000 is out of short' range'
        int salary = 100_000; // int is the most preferred data type for integer numbers

        long asset = 3_333_333_333L; // you can use L or l after the number

        // tax: 0.26
        float tax = 0.26f;   // you can use f or F after the number

        //double has the biggest range
        //double > float > long > int > short > byte

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);
        
        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);
        
        char gender = 'F';
        
        char grade = 'F';
        
        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);
        
        // char ch5 = 'AB'; you can use char for only single characters.
        
        boolean isEmployeed = true;
        boolean isMarried = false;
        
        boolean result = 100 > 300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name =  "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);



    }

}
