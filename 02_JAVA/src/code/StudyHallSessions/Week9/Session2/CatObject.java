package code.StudyHallSessions.Week9.Session2;

import code.StudyHallSessions.Week10.Session1;

import java.util.Arrays;

public class CatObject extends Session1 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setName("Balik");
        cat.setColor("mixed color");
        cat.setAge(2.0);
        System.out.println(cat);

        int [] arr2={1,3,5,7};


        System.out.println(Arrays.asList(Session1.evenNumbers()));

        Session1.sumOFOddNumbers(arr2);


    }
}
