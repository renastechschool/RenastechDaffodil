package code.day27_constroctor_AccessModifier;

public class c3_ConstroctorChainning {


    /*
    Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:

Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.-- we will see this later

Why do we need constructor chaining ?
This process is used when we want to perform multiple tasks in a single constructor
rather than creating a code for each task in a single constructor we create a separate constructor for each task
and make their chain which makes the program more readable.
     */

    //to be able to create a constroctor
    // access modifier + class name
    public c3_ConstroctorChainning(){
        System.out.println("Default Const"); //1
    }

    public c3_ConstroctorChainning(int a){
         //1
        System.out.println("Int const"); //2
    }

    public void method1(){
        System.out.println("method 1");
    }

    public void method2(){
        System.out.println("method 2 ");
    }
   // Within same class: It can be done using this() keyword for constructors in same class

    public  c3_ConstroctorChainning(String str){
        //System.out.println(); error you cant have anything before this keyword
        //this(); calls default const
        //this("hello"); you cant call same constructor in the same const
        // it will create a infitive loop
        this(10);//3
        //this();
        System.out.println("String const"); //3
        method2(); //4
    }

    public static void main(String[] args) {
        c3_ConstroctorChainning obj = new c3_ConstroctorChainning("hello");

    }

}


///to be able to call constructor you will need to use this() , this(10) , this("hello) etc
//you can only call one costructor from another one
//this ( ) keyword has to be first line in your constructor

// //this: refers to object instances
//        //this.: instances of the object
//        //this(): used for calling constructors within current class


//
//    constructor calls:(chainning) by using this() keyword
//            1. only constructor can call other constructor
//            2. constructor cannot be called by its name,  this() is used for calling
//            3. constructor call needs to be at the first step
//            4. One constructor can only call one constructor
//            5. Contructor cannot call itself or conatin itself