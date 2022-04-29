package code.day27_constroctor_AccessModifier;

public class c4_printOrder {

   public c4_printOrder(){//    {//when we create a new object constructor block will run
       System.out.println("Default const");
   }

    public static void main(String[] args) {
        System.out.println("Main method started");

        c4_printOrder obj1=new c4_printOrder();


    }

    static { // no mather what static blocks runs at begining once
        System.out.println("static block");
    }

    {//when we create a new object instance block will run
        System.out.println("instance block");
    }

    public static void methodStatic(){ // if we call it , it will run
        System.out.println("Static Method");
    }

    public void instanceMethod(){ // if we call it , it will run
        System.out.println("Instance block");
    }


}


//1.Static block
//2.Main method will run in order of line that we passed

//each new object will run instance block and constructor together
//c4_printOrder obj1=new c4_printOrder();
//firt instance block will get executed before constructor