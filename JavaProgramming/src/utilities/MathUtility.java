package utilities;

public class MathUtility {

    public static void main(String[] args) {

        System.out.println(sumOfTwoNumbers(7.4,10.6));
        System.out.println(subtractionOfTwoNumbers(10.2,40.2));
        System.out.println(divisionOfTwoNumbers(10.2,20.4));
        System.out.println(isEven(20));
        System.out.println(isOdd(20));
        System.out.println(maxBetweenTwoNumbers(1000,999));
        System.out.println(minBetweenTwoNumbers(50.8,39.6));
        System.out.println(squareOfNumber(4));
        System.out.println(cubeOfNumber(3));
    }

    //return the sum of two integers
    public static int sumOfTwoNumbers(int num1, int num2){

        return num1+num2;

    }

    //return the sum of two decimals
    public static double sumOfTwoNumbers(double num1, double num2){

        return num1+num2;

    }

    //return the subtraction of two integers
    public static int subtractionOfTwoNumbers(int num1, int num2){

        int result = 0;
        if (num1>num2){
        result = num1-num2;
        }else {
            result = num2-num1;
        }
        return result;
    }

    //return the subtraction of two decimals
    public static double subtractionOfTwoNumbers(double num1, double num2){

        double result = 0;
        if (num1>num2){
            result = num1-num2;
        }else {
            result = num2-num1;
        }
        return result;
    }

    //return the multiplication of two integers
    public static int multiplicationOfTwoNumbers(int num1, int num2){
        return num1*num2;
    }

    //return the multiplication of two decimals
    public static double multiplicationOfTwoNumbers(double num1, double num2){
        return num1*num2;
    }

    //return the division result
    public static double divisionOfTwoNumbers(double num1, double num2){
        double result = 0;
        if (num1>num2){
            result = num1/num2;
        }else {
            result = num2/num1;
        }
        return result;
    }

    //check if an integer is even number
    public static boolean isEven(int number){
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }

    public static boolean isOdd(int number){
        boolean result = false;
        if(!(number%2 == 0)){
            result = true;
        }
        return result;
    }

    //return the maximum number between two integers
    public static int maxBetweenTwoNumbers(int num1, int num2){

        int max = 0;
        if (num1>num2){
            max = num1;
        }else {
            max = num2;
        }
        return max;
    }

    //return the maximum number between two decimals
    public static double maxBetweenTwoNumbers(double num1, double num2){

        double max = 0;
        if (num1>num2){
            max = num1;
        }else {
            max = num2;
        }
        return max;
    }

    //return the minimum number between two integers
    public static int minBetweenTwoNumbers(int num1, int num2){

        int min = Integer.MAX_VALUE;
        if (num1<num2){
            min = num1;
        }else {
            min = num2;
        }
       return min;
    }

    //return the minimum number between two decimals
    public static double minBetweenTwoNumbers(double num1, double num2){

        double min = Double.MAX_VALUE;
        if (num1<num2){
            min = num1;
        }else {
            min = num2;
        }
        return min;
    }

    //return the square of an integer
    public static int squareOfNumber(int number){
        return number*number;
    }
    
    //return the square of a double
    public static double squareOfNumber(double number){
        return number*number;
    }

    //return the cube of an integer
    public static int cubeOfNumber(int number){
        return number*number*number;
    }

    //return the cube of a decimal
    public static double cubeOfNumber(double number) {
        return number * number * number;
    }

}
