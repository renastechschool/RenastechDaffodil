package code.day28_OOP_Encapsulation.Inheritence;

public class Bird extends Animal{

    //since we use extands keyword to get parent class for bird class (child class)
    //you will have all variables , method extended to your bird class

//  below all the variables and methods will be inherited from animal class (parent)
//    public String name;
//    public int age;
//    public double weight;
//    public  String color;
//    public  char gender;
//
//
//    public void eat(String food){
//        System.out.println(name + " is eating " + food);
//    }
//
//    public void grow(){
//        System.out.println(name + " is growing ");
//    }


    public void fly(){
        System.out.println(name + " is flying " );
    }
}
