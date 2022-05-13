package code.day32_Polymorphism.PolymorphismPractice;

public class Dog extends Animal{

    //
    ////create a Dog class that extends Animal   -- inheritence
    ///belows will be inherited
    //age,gender
    //eat,grow,animalMethod

    ////create a constructor that will take Dogname,gender and age
    public String DogName;

    public Dog(String DogName, int age , char gender){
        this.age=age;
        this.gender=gender;
        this.DogName=DogName;
    }

    ////owerwrite methods eat grow for Dog
    @Override
    public void eat(){
        System.out.println(DogName + " is eating ");
    }
    @Override
    public void growing(){
        System.out.println(DogName + " is growing ");
    }
    ////create a run method for Dog

    public void run(){
        System.out.println(DogName + " is running");
    }
}
