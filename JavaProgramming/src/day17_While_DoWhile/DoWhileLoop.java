package day17_While_DoWhile;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean a = false;

        for (int i = 0; a;) {
            System.out.println("Wooden Spoon -- for loop");
        }

        while (a){
            System.out.println("Wooden Spoon -- while loop");
        }

        System.out.println("__________________");

        do{
            System.out.println("Wooden Spoon -- Do while loop");
        }while(a);

    }

}
