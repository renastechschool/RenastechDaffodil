package code.day32_Polymorphism;

public class Abstraction extends test1 implements test2,test3{
    @Override
    public void method1() {

    }

    @Override
    public void method3() {

    }

    @Override
    public String method4() {
        return null;
    }

    // //oop questions
    //    //tips to remember
    //
    //    //1.explain what is it
    //    //2.explain how you achive
    //    //3.where you are using in your project

}

abstract class test1{
    public abstract void method1();
    public void method2(){

    }
}

interface test2{
    void method3(); // public abstract
    String method4();//public abstract

    int number = 100; // public final static
}

interface test3{

}