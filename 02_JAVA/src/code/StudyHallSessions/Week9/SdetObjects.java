package code.StudyHallSessions.Week9;

public class SdetObjects {
    public static void main(String[] args) {

        //first way to create an object and update attributes of object. ,, 5 line
        SDET obj1=new SDET();
        obj1.name="UU OO";
        obj1.companyName="Apple";
        obj1.salary=180000;
        obj1.employeeID=12;

        System.out.println(SDET.schoolName);


        System.out.println(obj1.companyName); //Apple

        //Second way to create an object and update object's attributes. // 2 lines
        SDET obj2=new SDET();
        obj2.setInfo("YY ZZ ",10,500000,"Meta");

        System.out.println(obj2.employeeID); //10

        System.out.println(SDET.schoolName);

        //Third way ,
        SDET obj3=new SDET("AA PP ",9,200000,"K n");

        System.out.println(obj3.salary); //200000.0
        System.out.println(SDET.schoolName);







    }
}
