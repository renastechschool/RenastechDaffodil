package code.day32_Polymorphism.PolymorphismPractice;

import code.MyUtils.GenericUtils;

public class Objestss {

    public static void main(String[] args) {
        Dog dog1=new Dog("Dog1",15,'m');
        dog1.eat();
        dog1.growing();
        dog1.animalMethod();
        dog1.run();

        GenericUtils.Stars();

        Animal animal1=new Animal();
        animal1.eat();
        animal1.growing();
        animal1.animalMethod();
        //animal1.run()

        GenericUtils.Stars();

        Animal animal2=new Dog("Dog2" , 23 , 'f');
        animal2.eat(); // result will come from dog
        animal2.growing(); // result will come from dog
        animal2.animalMethod();
       // animal2.run(); methods comes from Dog ; cant be used in form of animal2
    }
}
