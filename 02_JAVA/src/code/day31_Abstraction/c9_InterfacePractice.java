package code.day31_Abstraction;

public interface c9_InterfacePractice {
    //there is only one access modifier allowed in interface ==> public
    //what we can have in interface?
    //variable: static & final by default
    //methods: abstract methods, static methods, default method

//    what we cannot have in interface?
//    constructor
//    instance variable
//    instance methods
//    blocks



//    public c9_InterfacePractice(){
//        interfaces con not have constractor
    //you cant create an object from it
//    }

//    public void method1(){
//
//    }

    //variable: static & final by default


    int number=100; // final static
    final static int number2 = 200 ;

    public static void main(String[] args) {
        System.out.println(number);

        //number = 300 ; final variables can not be reassigned
        //number2 = 0; final variables can not be reassigned
    }


}
