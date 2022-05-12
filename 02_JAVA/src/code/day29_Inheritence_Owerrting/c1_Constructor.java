package code.day26_StaticBloc_Constructor.day29_Inheritence_Owerrting;

class test{
    //constructor
    //access modifier  +class name
    public test(){
        System.out.println("test");
    }
}
public class c1_Constructor extends test{


    //test() inherited

    public c1_Constructor(){
        System.out.println("C1 constructor");
    }

    public c1_Constructor(String str){
        System.out.println("constructor c1 string");
    }

    public static void main(String[] args) {
        c1_Constructor obj1=new c1_Constructor();
        //since c1_const takes test class as parent
        //constructor of test will be inherited

    }
}

//parent : test
//child c1_constructor
