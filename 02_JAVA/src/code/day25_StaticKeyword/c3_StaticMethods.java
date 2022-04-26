package code.day25_StaticKeyword;

import code.MyUtils.GenericUtils;

public class c3_StaticMethods {

    //When a method is declared with static keyword, it is known as static method.
// The most common example of a static method is main( ) method.As discussed above,
// Any static member can be accessed before any objects of its class are created,
// and without reference to any object.
// Methods declared as static have several restrictions:
//
//They can only directly call other static methods.
//They can only directly access static data.

    int aInstance=10;
    static int bStatic=20;

    public static void main(String[] args) { // static method
       // System.out.println(aInstance);
        //you cant directly call instance variable in static method
        //we need to create an object from class

        c3_StaticMethods obj1=new c3_StaticMethods();
        System.out.println("obj1.aInstance = " + obj1.aInstance);
        System.out.println(bStatic);

       // instanceMethod() // we cant call instance method with out object

        obj1.instanceMethod();

        staticMethod();
        //GenericUtils.Stars();

    }


    public void instanceMethod(){ // if method doesnt have static keyword it is instance method
        System.out.println("This is an instance method");
        System.out.println(aInstance);
        //since method is instance we can just call instance variable no need to create an object here

        System.out.println(bStatic);//static variables know as global variable
        //they can be used in any method

    }

    public static void staticMethod(){
        System.out.println("Static method");
    }


}
