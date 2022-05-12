package code.day26_StaticBloc_Constructor.day29_Inheritence_Owerrting.CarTask;

public class BMW extends Car{

    //start ,stop ,consume will be inherited

    //    //method overriding: same method name, same parameter, same return-type  (MUST)
////				   MUST happen in the sub class
////				   access modifer MUST be same or more visible
////				   ONLY the instance methods can be overridden
////				   @Override annotation MUST be applicable
////


    @Override
    public void startCar(){
        System.out.println("**BMW is Started ***");
    }
}

//why we need overriding: to implement different functions to the same method
//				reusable
//				flexible
//				less memory
//				easy to memorize