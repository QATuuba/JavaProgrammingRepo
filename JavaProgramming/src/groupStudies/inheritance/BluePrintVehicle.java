package groupStudies.inheritance;

public class BluePrintVehicle {

    public static void main(String[] args) {

        Engine engine = new Engine();

        engine.setSize(2000);
        engine.setFuelType("Diesel");

        Car car = new Car(engine);

        car.move();
        car.stop();

        Vehicle vehicle = new Vehicle(engine);

        System.out.println(vehicle);

    }

}
