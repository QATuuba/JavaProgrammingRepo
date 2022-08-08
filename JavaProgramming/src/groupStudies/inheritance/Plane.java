package groupStudies.inheritance;

public class Plane extends Vehicle{


    public Plane(Engine engine1) {
        super(engine1);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Plane is flying");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Plane is landing");
    }
}
