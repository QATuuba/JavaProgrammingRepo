package groupStudies.inheritance;

public class Vehicle {

    private String color;
    private String type;
    private int year;
    private String model;
    private String brand;

    private final Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void move(){
        engine.runEngine();
    }

    public void stop(){
        engine.stopEngine();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engine= size" + engine.getSize() +
                '}';
    }
}
