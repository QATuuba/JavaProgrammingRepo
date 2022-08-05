package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        //String myGroup; []  false
        //[] String myGroup;   false
        //String myGroup[];   true

        String[] myGroup = new String[5];//0 ~ 4
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        //myGroup[5] = "Muhtar";// you can't add more. it gives error
        //myGroup[-1] = "Adam";you can't give negative number. The smallest number for array is 0

        //System.out.println(myGroup);//hashcode ==> wrong way to print

        System.out.println(Arrays.toString(myGroup));// ["Gunay", "Neira", "Suat", "Hulya, "Mikael"

        System.out.println("_______________________________");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Java Day"};

        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number< 1 || number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[5 - 1]);//cunku 5. data cumartesi. 5. gunu bulmak icin 4. datayi almak lazim. 0 dan basliyor

    }

}
