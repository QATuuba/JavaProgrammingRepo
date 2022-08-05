package day25_CustomMethod_Overloading;

public class ReturnTheMinTask {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int min = minNumber(array);
        System.out.println(min);

        float[] arrayF = {0.1f,0.2f,0.3f,0.4f};
        float minF = minNumber(arrayF);
        System.out.println(minF);

    }

    public static int minNumber(int[] array){

        int min = Integer.MAX_VALUE;

        for (int each : array) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }

    public static double minNumber(double[] array){

        double min = Double.MAX_VALUE;

        for (double each : array) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }

    public static long minNumber(long[] array){

        long min = Long.MAX_VALUE;

        for (long each : array) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }

    public static short minNumber(short[] array){

        short min = Short.MAX_VALUE;

        for (short each : array) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }

    public static float minNumber(float[] array){

        float min = Float.MAX_VALUE;

        for (float each : array) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }

    public static byte minNumber(byte[] array){

        byte min = Byte.MAX_VALUE;

        for (byte each : array) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }
}
