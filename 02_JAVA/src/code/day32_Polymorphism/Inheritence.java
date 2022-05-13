package code.day32_Polymorphism;

public class Inheritence {

    // //oop questions
    //    //tips to remember
    //
    //    //1.explain what is it
    //    //2.explain how you achive
    //    //3.where you are using in your project

    public double number ;
    protected int number2 ;
    byte number3 ;

}

class inherTest extends Inheritence{
    //it will inherited all the methods from parent


    public static void main(String[] args) {
        inherTest obj=new inherTest();

        obj.number=100;
        obj.number2=200;
        obj.number3=30;

        System.out.println("obj.number2 = " + obj.number2);


    }

}
