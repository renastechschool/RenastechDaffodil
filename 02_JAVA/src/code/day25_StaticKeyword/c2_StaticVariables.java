package code.day25_StaticKeyword;

import code.MyUtils.GenericUtils;

public class c2_StaticVariables {
//Static variables
//
// When a variable is declared as static, then a single copy of variable is created
// and shared among all objects at class level. Static variables are, essentially, global variables.
// All instances of the class share the same static variable.
//
//We can create static variables at class-level only.
//static: class member, can be called through the class
//there is only one copy of static shared by all objects
//
//            prefers to be called through class name
//
//            static ONLY accepts static
//
//
//    static members:
//            1. static variable (global variables)
//            2. static methods
//            3. static initializer block
//            4. static nested class
//

    //static variable: declared outside any block with static keyword.
////there is only one copy of static shared by all objects


    //Instance: every single object of the class has its own copy
//
    //local variable: variables that are declared in a block
    //instance variables: declared outside the blocks
    //Static variables : declared outside the blocks with a static keyword


    int instanceVarible=25;// instance
    int number=10; //instance
    static int staticVarible=100; //static variable


    public static void main(String[] args) {

        int localVariable=200; // local variable

        //to be able to use instance variable inside static method
        //we will need to create an object for it
        c2_StaticVariables obj1 =new c2_StaticVariables();
        System.out.println(obj1.instanceVarible); // 25

        System.out.println(staticVarible); // 100
        //Static variables will have one copy for all object

        c2_StaticVariables obj2=new c2_StaticVariables();
        c2_StaticVariables obj3=new c2_StaticVariables();

        obj2.instanceVarible=250;
        obj3.instanceVarible=350;

        obj1.staticVarible=55;
        obj2.staticVarible=155;
        obj3.staticVarible=555;


        System.out.println("obj1.instanceVarible = " + obj1.instanceVarible);
        System.out.println("obj2.instanceVarible = " + obj2.instanceVarible);
        System.out.println("obj3 = " + obj3.instanceVarible);


        GenericUtils.Stars();

        System.out.println(obj1.staticVarible);
        System.out.println(obj2.staticVarible);
        System.out.println(obj3.staticVarible);

    }

    {
      //block
    }

    //local variable : declerad inside of block

    //instance variable :declared outside of the blocks
    //instance variable can have multiple copy from object
    //they needs to be called through object

    //static variables :declared outside of any block with static keyword
    //static variable can only have one copy from object
    //they can also be called with classname itself

}
