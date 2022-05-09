package code.StudyHallSessions.Week10.Session3;


import java.time.LocalDate;

//           child         Parent
public class User extends Account {

    //note: after extends Account class in my child class
    //my child class will have all atributes that super class has.


//    String name;
//    long phoneNumber;
//    String location;


    @Override // we will over-ride post method from Account Class
    public void post(){

        System.out.println(name + " has shared : ");
        System.out.println("I started to work at Amazon");

        System.out.println(LocalDate.now() + " from "+location);

    }





}
