package code.day31_Abstraction;

public class ShapeObject {

    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(3,5);
        //area of rec 1 == width * lenght
        rectangle1.shapeName();
        rectangle1.shapeArea();

        Square square1 =new Square(4);
        //area of square 16
        square1.shapeName();
        square1.shapeArea();

    }
}
