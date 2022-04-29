package code.day26_StaticBloc_Constructor;

import code.MyUtils.GenericUtils;

public class MultiClassesPractice {
    public static void main(String[] args) {
        lab01.Reverse();
        lab02.lab02Answer();
        lab04.returnMethod();
        GenericUtils.reverseString("Ali");
        GenericUtils.Stars();

    }



}
class lab01{
    public static void main(String[] args) {

    }
    public static void Reverse(){
        System.out.println("Reverse method");
    }
}

class lab02{
    public static void main(String[] args) {


    }
    public static void lab02Answer(){
        System.out.println("lab02 Answer.");
    }
}

class lab04{

    public static void main(String[] args) {

    }
    public void method1(){
        System.out.println("");
    }

    public static String returnMethod(){
        return  "Hello";
    }
}
