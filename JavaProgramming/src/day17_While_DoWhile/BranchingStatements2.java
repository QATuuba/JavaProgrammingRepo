package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C'){
                break;
            }
            System.out.println(i);//A B
        }

        System.out.println("__________________");

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C'){
                continue;
            }
            System.out.println(i);//A B D E
        }

        System.out.println("_________________");

        //print all even numbers 1~10 (skip the odd numbers)

        for (int i = 1; i < 11; i++) {
            if (i%2 != 0) {//1,3,5,7,9
                continue;
            }
            System.out.println(i);
        }


        System.out.println("_________________________");

        //print all odd numbers 1~10 (skip the even numbers)

        for (int i = 1; i < 11; i++) {
            if (i%2 == 0){//2,4,6,8,10
                continue;
            }
            System.out.println(i);
        }

    }

}
