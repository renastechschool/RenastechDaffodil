package code.StudyHallSessions.Week10.Session3;

import java.time.LocalDate;

//          child           Parent
public class Company extends Account{

    ////note: after extends Account class in my child class
    ////my child class will have all atributes that super class has.

//
//    String name;
//    long phoneNumber;
//    String location;


    @Override
    public void post() {
        System.out.println("Company name : "+name);

        System.out.println("Happy Friday, Enjoy your weekend!!");

        System.out.println(LocalDate.now() +" from "+location);
    }
}
