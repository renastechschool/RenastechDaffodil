package code.day32_Polymorphism.PolymorphismPractice;

public class Animal {

    //age , gender
    //eat , grow

    public int age;
    public char gender;

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void growing(){
        System.out.println("Animal is growing");
    }

    public void animalMethod(){
        System.out.println("This is Animal method");
    }
}
