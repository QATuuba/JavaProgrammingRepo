package day35_Encapsulation;

public class Rectangle {

    private int width, length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0){
            return;
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            return;
        }
        this.length = length;
    }

    public Rectangle(int width, int length) {
        setWidth(width);
        setLength(length);
    }

    public int calcArea(){
        return width*length;
    }

    public int calcPerimeter(){
        return 2*(width + length);
    }

    public String toString() {
        return  "width=" + width + "\n" +
                "length=" + length + "\n" +
                "area=" + calcArea() + "\n" +
                "perimeter=" + calcPerimeter() + "\n";
    }
}
