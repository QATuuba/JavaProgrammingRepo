package day42_Exceptions;

public class MorningWorkout {

    public static void main(String[] args) {

        System.out.println("--------Push up started----------");

        for (int i = 1; i <= 30; i++) {

            System.out.print("\rPush up " + i);

            /*
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

             */

            sleep(0.5);

        }

        System.out.println("-----------Push up completed-------------");

        System.out.println("--------Pull up started----------");

        for (int i = 1; i <= 20; i++) {

            System.out.print("\rPull up " + i);

            /*
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

             */

            sleep(0.1);

        }

        System.out.println("-----------Pull up completed-------------");

    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each
			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */