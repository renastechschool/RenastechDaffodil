package code.day28_OOP_Encapsulation.Inheritence;

public class AnimalObject {

    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.name="animal1";
        animal1.age=22;
        animal1.color="black";
        animal1.gender='f';
        System.out.println(animal1);

        Bird bird1=new Bird();
        bird1.name="bird1";
        bird1.color="yellow";
        bird1.eat("worm");
        bird1.fly();
        System.out.println(bird1);

        Fox fox1=new Fox();
        fox1.name="fox1";
        fox1.age=3;
        fox1.color="Brown";
//        fox1.fly()
        fox1.smileFox();
    }
}
