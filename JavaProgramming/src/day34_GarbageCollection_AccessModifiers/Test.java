package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;

import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("-------------------------------");

        //find the sum of 10,20

        int r1 = sumOfTwoNumbers(10,20);

        //find the sum of 100, 200

        int r2 = sumOfTwoNumbers(100,200);

        System.out.println(r1);
        System.out.println(r2);

        int r3 = subtractionOfTwoNumbers(100,50);
        System.out.println(r3);

        int r4 = maxBetweenTwoNumbers(1000,2000);
        System.out.println(r4);

    }
}
