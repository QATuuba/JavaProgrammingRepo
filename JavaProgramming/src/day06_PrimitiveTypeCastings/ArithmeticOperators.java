package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); //concatenation
        System.out.println(10 + 20);  // addition
        System.out.println(100 - 50); // subtraction
        System.out.println(10 * 5);   //multiplication


        System.out.println(100 / 3); //33
        System.out.println(10 / 4); //2
        System.out.println(10.0 / 4); //2.5
        System.out.println(10d / 4); //2.5

        int a = 100;
        double b = a / 6;//16.0

        double c = a / 6.0; // 16.666666
        double d = a / 6d;// 16.6666

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println( 100D);

    }

}



/*
        +: Addition
        -: Subtract
        *: Multiplication
        /: Division

        integer / integer -> integer
        Decimal / integer -> decimal
        integer / decimal -> decimal
        decimal / decimal -> decimal


            in math
               10/4 = 2.5
               100/3 = 33.33333

            in java
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33


        %: Remainder
         */