package day23_CustomMethods_Void;

public class CustomCalculator {

    public static void main(String[] args) {
        calculator(40,'=',10);

    }

    public static void calculator(int firstNumber, char mathOperator, int secondNumber) {

        int result = 0;

        if (mathOperator == '+') {
            result = firstNumber + secondNumber;
        } else if (mathOperator == '-') {
            if (firstNumber > secondNumber) {
                result = firstNumber - secondNumber;
            } else {
                result = secondNumber - firstNumber;
            }
        } else if (mathOperator == '*') {
            result = firstNumber * secondNumber;
        } else if (mathOperator == '/') {
            if (firstNumber > secondNumber) {
                result = firstNumber / secondNumber;
            } else {
                result = secondNumber / firstNumber;
            }
        } else {
            System.out.println("Invalid operation");
        }

        System.out.println(result);

    }

}
