package code.day26_StaticBloc_Constructor;

public class ConstructorInfo {

    // Constructor in java is a special method that is used to initialize object
    //The Constructor is called when an object of the class is created ,
    // it can used to set initial values for object attributes.

    //1- Constructor needs to have same name that class have.
    //2- Even if you don't create one constructor java will create one as default.

    public ConstructorInfo(){ // this is my constructor.
        //it will created automaticly by java as Default
        // constructor will help to create an object

    }

    //Can we overload constructor methods?
    // yes

    public ConstructorInfo(int a){
        System.out.println("Constructor with argument int "+a);


    }

    public static void main(String[] args) {

        ConstructorInfo obj=new ConstructorInfo(); // created an object with default constructor.

        ConstructorInfo obj2= new ConstructorInfo(2); // created an object with constructor that has parameter.



    }

    //updated package name
}
