package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);//Square{side=10.0'area='100.0'perimeter='40.0'}

        //square.side = 20;

        //square.setSide(0);

        //System.out.println(square);//Invalid Side: 0.0

        System.out.println(square.getName());

        System.out.println("_______________________");

        Rectangle rectangle = new Rectangle(5,6);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        System.out.println("-----------------------");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        circle.setRadius(15.5);

        System.out.println(circle.getRadius());

        System.out.println(circle);

        System.out.println(circle.getName());

    }

}
