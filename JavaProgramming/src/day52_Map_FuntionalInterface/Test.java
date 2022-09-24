package day52_Map_FuntionalInterface;

//lambda: () -> {}

public class Test {

    public static void main(String[] args) {

        //function1: create a function that can display a number is odd
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n%2 ==0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);

        // function2: create a function that can check if a person is eligible to buy alcohol

        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (age) -> {
            if (age>= 21){
                System.out.println("Eligible to buy alcohol");
            }else {
                System.out.println("Not eligible to buy alcohol");
            }

        };

        eligibleToBuyAlcohol.apply(100);

        //function3: create a function that can display the cube of a number

        MyFirstFunctionalInterface printCube;
        printCube = (side) -> {
            System.out.println(side*side*side);
        };

        printCube.apply(3);

        //function4: create a function that can check if a number is evenly divisible 3&5

        MyFirstFunctionalInterface divisibleBy3And5 = n -> {
          if (n%3==0 && n%5==0){
              System.out.println(n + " is divisible 3 and 5");
          }else {
              System.out.println(n + " is not divisible 3 and 5");
          }
        };

        divisibleBy3And5.apply(30);

    }

}
