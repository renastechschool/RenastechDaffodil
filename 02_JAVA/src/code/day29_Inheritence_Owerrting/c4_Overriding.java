package code.day26_StaticBloc_Constructor.day29_Inheritence_Owerrting;
//    //method overriding: same method name, same parameter, same return-type  (MUST)
////				   MUST happen in the sub class
////				   access modifer MUST be same or more visible
////				   ONLY the instance methods can be overridden
////				   @Override annotation MUST be applicable
////

class test5{
    int number;
    public void method2(){
        System.out.println("method 2");
    }
}

public class c4_Overriding extends  test5{
    //after extending method2 and number will be inherited from the parent

    //overloading measn same method with different loads

    public void method1(int number){

    }


    public void method1(String str){

    }

    @Override
    public void method2(){
        System.out.println("override method2");

    }

    public static void main(String[] args) {
        c4_Overriding obj=new c4_Overriding();
        obj.method2();
    }


}

//why we need overriding: to implement different functions to the same method
//				reusable
//				flexible
//				less memory
//				easy to memorize