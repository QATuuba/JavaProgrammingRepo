package day38_Inheritance.shapeTask;

public class Circle extends Shape{


    public double r;
    public static double pi;

    static {
        pi = 3.14;
    }

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*pi;
    }

    @Override
    public double perimeter() {
        return 2*r*pi;
    }


    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", name='" + name + '\'' +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
    r
	pi

	toString(): name, r, pi, area, perimeter
 */