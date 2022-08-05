package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 5;
        int b = 15;
        int c = 20;

        boolean aIsMedian = (b < a && a < c) || (c < a && b > a);
        boolean bIsMedian = (a < b && b < c) || (c < b && a > b);
        boolean cIsMedian = (a < c && b > c) || (a > c && b < c);
        //boolean cIsMedian = !aIsMedian && !bIsMedian

        if (aIsMedian){
            System.out.println(a + " is the median number");
        }
        if (bIsMedian){
            System.out.println(b + " is the median number");
        }
        if (cIsMedian){
            System.out.println(c + " is the median number");
        }


    }

}
