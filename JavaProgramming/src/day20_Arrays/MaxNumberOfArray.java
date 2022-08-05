package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {
        
        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {//the short way of this ==> "numbers.fori".
        if (numbers[i] > max){
            max = numbers[i];
        }
        }

   //     for (int i = numbers.length - 1; i >= 0; i--) {   //for decreasing ==> numbers.forr
          //
        //}
        System.out.println(max);

    }
    
}
