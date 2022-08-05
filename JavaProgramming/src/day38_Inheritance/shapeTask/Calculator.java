package day38_Inheritance.shapeTask;

import org.w3c.dom.css.Rect;

public class Calculator {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(3,4);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

    }

}
