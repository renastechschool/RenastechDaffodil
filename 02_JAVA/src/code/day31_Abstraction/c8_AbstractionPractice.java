package code.day31_Abstraction;

public class c8_AbstractionPractice implements test1,test2,test3 {
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public void method3() {

    }


    //it will inherite all the methods from test 1 ,test2 ,test 3
    //below method will be inherited from parent classes
    //met1 ,met2 ,met3

}

interface test1{
    void method1(); // public abstract
}

interface test2{
    abstract int method2(); // public abstract
}

interface test3{
    public abstract void method3(); // public abstract
}


class test4{


}

abstract class test5{
    abstract void aaa();
    abstract void bbb();

}
//
//class test6 extends  test4 ,test5{
//
//}

//differences between abstract class and interface
//A class can inherit from one class only (extends)
//A class can inherit multiple interfaces (implements)