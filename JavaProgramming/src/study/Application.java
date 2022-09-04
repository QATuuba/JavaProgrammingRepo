package study;

public class Application {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        Zoo myZoo = new Zoo();

        myZoo.addAnimal(dog);
        myZoo.addAnimal(cat);
        myZoo.addAnimal(bird);

        //Dog dog1 = new Animal();

        ClassA object = new ClassB();

        ClassC object1 = new ClassD();

        ClassA x = new ClassC();
        //ClassC x1 = new ClassB();
    }

}
