package day38_Inheritance.shapeTask;

public class Square extends Shape{

    public Square(double s) {
        super("Square");
        this.s = s;
    }

    public double s;

    @Override
    public double area() {
        return s*s;
    }

    @Override
    public double perimeter() {
        return 4*s;
    }

    public String toString() {
        return "Square{" +
                "s=" + s +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
