package day35_Encapsulation.encapsulation;

public class CircleTask {

    private double radius;
    public static double pi;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    public CircleTask(double radius) {
        setRadius(radius);
    }

    static {
        pi = 3.14;
    }

    public double calculateArea(){
        return radius*radius*pi;
    }

    public double calculatePerimeter(){
        return 2*radius*pi;
    }

    public String toString() {
        return "CircleTask{" +
                "radius=" + radius +
                " area=" + calculateArea() +
                " perimeter=" + calculatePerimeter() +
                '}';
    }
}
