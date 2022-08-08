package groupStudies.inheritance;

public class Car extends Vehicle {

    public Car(Engine engine) {
        super(engine);
    }



    @Override
    public void move() {
        super.move();
        System.out.println("Car is driving");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Car is stopping");
    }
}
