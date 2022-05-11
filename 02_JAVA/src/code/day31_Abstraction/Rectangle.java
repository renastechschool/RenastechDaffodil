package code.day31_Abstraction;

public class Rectangle extends  Shape{

    //inherited
    //shapeName , shapeArea
    // abstract methods are meant to be overrwite
    // so i need to override my abstract methods in order to not have issue

    public final String shapeName="Rectangle";
    public double width;
    public double length;

    public Rectangle(double width , double length){
        this.width=width;
        this.length=length;
    }

    @Override
    void shapeArea(){
        //rectangle area is = width * length
        double area = width * length;
        System.out.println("Area of " + shapeName + " is " + area);
    }

    @Override
    void shapeName(){
        System.out.println("shapeName = " + shapeName);
    }

}
