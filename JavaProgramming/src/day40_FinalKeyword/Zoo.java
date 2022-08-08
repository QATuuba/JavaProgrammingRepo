package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);

        System.out.println(dog.getName());
        System.out.println(dog.getGender());

        dog.drink();

    }
}
