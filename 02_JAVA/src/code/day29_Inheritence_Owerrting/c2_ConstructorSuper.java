package code.day29_Inheritence_Owerrting;

public class c2_ConstructorSuper extends test2 {

    //parent class constructors will be inherited

    public c2_ConstructorSuper(){
        super(35);

        System.out.println("c2 cons default");
    }

    public c2_ConstructorSuper(int num1,String str){
        super();

        System.out.println("c2 cons string and int");
    }

    public static void main(String[] args) {
        c2_ConstructorSuper obj1=new c2_ConstructorSuper();
        c2_ConstructorSuper obj2=new c2_ConstructorSuper(34,"hello");
    }

}

class test2{

    public test2(String str){
        System.out.println("Test 2 string");
    }

    public test2(int num){
        System.out.println(" test 2 int");
    }

    public test2(){
        System.out.println("test 2 default");
    }
}
   // constructor chainning From base class: by using super() keyword to call constructor from the base class.-- we will see this later
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