package day35_Encapsulation;

public class Square {

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side<0){
            return;
        }
        this.side = side;
    }

    public Square(int side) {
        setSide(side);
    }

    public int calcArea(){
        return side*side;
    }

    public int calcPerimeter(){
        return side*4;
    }

    public String toString() {
        return "side=" + side + "\n" +
                "area=" + calcArea() + "\n" +
                "perimeter=" + calcPerimeter();
    }
}
