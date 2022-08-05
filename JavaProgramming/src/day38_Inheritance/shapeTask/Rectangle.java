package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    public Rectangle(double l, double w) {
        super("Rectangle");
        this.l = l;
        this.w = w;
    }

    public double l;
    public double w;

    @Override
    public double area() {
        return l*w;
    }

    @Override
    public double perimeter() {
        return 2*(l+w);
    }


    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", w=" + w +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
