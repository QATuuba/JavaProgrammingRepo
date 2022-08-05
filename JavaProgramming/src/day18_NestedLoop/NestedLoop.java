package day18_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("____________________");

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }
        }

    }

}
