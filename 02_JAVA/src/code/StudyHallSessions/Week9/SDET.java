package code.StudyHallSessions.Week9;


//    create a class called SDET
public class SDET {

 // Attributes:
//    name, employeeID, Salary , companyName

    String name; // instance variables
    int employeeID;
    double salary;
    String companyName;

    //as static
    static String schoolName="Renastech";

//    Actions:
//    setInfo(), testing()--> name is testing , creatingTicket(boolean isBug);

    // setInfo()
    public void setInfo(String name, int employeeID, double salary, String companyName){

        this.name=name; // object's name will equals to our first parameter.
        this.employeeID=employeeID;// object's name will equals to our second parameter.
        this.salary=salary; // object's name will equals to our third parameter.
        this.companyName=companyName; // // object's name will equals to our fourth parameter.

    }

    public SDET(){ // deafult constructor.

    }

    //Constructor ,, overloading of default constructor.
    public  SDET(String name1,int employeeID1, double salary1 , String companyName1){
        this.name=name1;
        this.employeeID=employeeID1;
        this.salary=salary1;
        this.companyName=companyName1;

    }





    //testing()--> name is testing
    public void testing(){
        System.out.println(name + " is testing. ");
    }

    // creatingTicket(boolean isBug);
    public void creatingTicket(boolean isBug){

        if (isBug){
            System.out.println(name + " is creating ticket. Bug founded..");
        }else {
            System.out.println("No Bug , no ticket.");
        }

    }


}
