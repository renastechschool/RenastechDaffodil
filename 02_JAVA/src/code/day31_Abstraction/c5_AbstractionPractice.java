package code.day31_Abstraction;

public class c5_AbstractionPractice extends  abstractClass1{
    @Override
    public void abstractMethod1() {
        System.out.println(" abstract method in abstract class");
    }

    //extands will apply inheritence logic
    //which means it will extend
    //belows are going to be extended
    //method2 abstractmethod1

}


abstract class abstractClass1{

    public abstract void abstractMethod1();
    //no body needed in abstract methods
    //it needs to be overriden

    public void method2(){
        System.out.println("method 2 ");
    }

}

abstract class abstractClass2 extends abstractClass1{
    //belows are going to be extended
    //method2 abstractmethod1

    //abstrac classes can have reguler method and abstract method
    //extend abstract method and method2
    //public abstract void abstractMethod1();
    //public void method2(){body}

    abstract void abstractMethod3();

}

class class3 extends abstractClass2{
    //abstractMethod1();  method2()  ;abstractMethod3(); will be inherited as soon as you extend

    @Override
    public void abstractMethod1() {

    }

    @Override
    void abstractMethod3() {

    }
}


//parent : abstract 2   ;;;abstractMethod1();  method2()  cames from grandparent abstractClass1
//child : class3