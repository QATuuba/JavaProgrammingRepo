package day41_Exeptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        /*
        try {

            System.out.println(employee.getSalary());

        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }//Third catch block
         //java.lang.NullPointerException
         //at day41_Exeptions.MultiCatchBlocks.main(MultiCatchBlocks.java:13)

         //Process finished with exit code 0

         */

        try {

            System.out.println(employee.getSalary()); // Null Pointer Exception

        }catch (NullPointerException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }//First Catch Block
         //java.lang.NullPointerException
         //at day41_Exeptions.MultiCatchBlocks.main(MultiCatchBlocks.java:35)

        System.out.println("Test completed");

        System.out.println("---------------------");

        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }



    }

}
