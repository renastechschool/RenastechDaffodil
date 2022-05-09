package code.StudyHallSessions.Week10.Session3;

public class LinkedInObjects extends OverLoadingAndOverRiding {
    public static void main(String[] args) {

        User person1=new User();
        // person1 is object from User class

        person1.post(); //  System.out.println("This is post !! ");

        Company company1=new Company();
       // company1 is object from Company class.
        company1.post(); //  System.out.println("This is post !! ");

        System.out.println("******************************");


        /////////////////////////////////////////////
        ////////////////////////////////////////////

        User person2=new User();
        person2.post(); // I started to work at Amazon

        Company company2=new Company();

        company2.post(); //Happy Friday, Enjoy your weekend!!

        System.out.println("==============================");

        User person3=new User();
        person3.name="Jack";
        person3.location="Toronto";
        person3.phoneNumber=903456312;

        person3.post();
        //Jack has shared :
        //I started to work at Amazon
        //2022-05-06 from Toronto

        System.out.println("************");

        Company company3=new Company();
        company3.name="Renastech";
        company3.location="US Remote!";
        company3.phoneNumber=23334556;

        company3.post();
        //Company name : Renastech
        //Happy Friday, Enjoy your weekend!!
        //2022-05-06 from US Remote!


        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("*************************");

        // if i want to use sum method from OverloadingAndOverRidign class
        //I have 2 options

        //1- Classname.methodName
        OverLoadingAndOverRiding.sum(5 ,6); // 5 + 6 = 11

        //extends parent class // parent==super
        sum(4,4,3); // 4 + 4 + 3 = 11

        sum(2,4,2,1);// 2 + 4 + 2 + 1 = 9



    }
}
