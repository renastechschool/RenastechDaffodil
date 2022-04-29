package code.day26_StaticBloc_Constructor;

// in java we can have only public class in.

class Cat{
    public static void main(String[] args) {
        System.out.println("Fox class main method");
    }

    public static void catHello(){
        System.out.println("Hello from Car!");
    }


}

public class MultiClasses {
    public static void main(String[] args) {

        System.out.println("MultiClasses main method");

        Cat.catHello();


    }




}

class Fox{
    public static void main(String[] args) {

        System.out.println("Fox Class main Mehtod."); //Fox Class main Mehtod.


    }

    public static void foxMethod(){
        System.out.println("Hello from Fox!");
    }

}
