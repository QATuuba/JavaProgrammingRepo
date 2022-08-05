package day25_CustomMethod_Overloading;

public class ReturnTheMaxTask {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int max = maxNumber(array);
        System.out.println(max);

    }

    public static int maxNumber(int[] array){

        int max = 0;
        for (int each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }

    public static double maxNumber(double[] array){

        double max = 0;
        for (double each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }

    public static long maxNumber(long[] array){

        long max = 0;
        for (long each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }

    public static short maxNumber(short[] array){

        short max = 0;
        for (short each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }

    public static float maxNumber(float[] array){

        float max = 0;
        for (float each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }

    public static byte maxNumber(byte[] array){

        byte max = 0;
        for (byte each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }

}
