package groupStudies.inheritance;

public class Engine {

    private int size;
    private String fuelType;




    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void runEngine(){
        System.out.println("Engine is running");
    }

    public void stopEngine(){
        System.out.println("Engine stopped");
    }

}
