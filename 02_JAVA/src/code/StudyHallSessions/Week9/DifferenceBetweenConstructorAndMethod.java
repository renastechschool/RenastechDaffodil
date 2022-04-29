package code.StudyHallSessions.Week9;

public class DifferenceBetweenConstructorAndMethod {
    public static void main(String[] args) {

        //--Constructor :A Constructor is a special method that initializes a newly created object.
        SDET objc1= new SDET();

        //--Method : A Method is a block of code which returns a value upon its execution.,or void ,

        // public int sumof2Number(int a , int b){
        //        return a+b;
        //    }


        //--A Constructor’s name must be same as the name of the class.
        //--A Method’s name can be anything.


        // public SDET(){ // deafult constructor.
        //
        //    }
        //
        //    //Constructor ,, overloading of default constructor.
        //    public  SDET(String name1,int employeeID1, double salary1 , String companyName1){
        //        this.name=name1;
        //        this.employeeID=employeeID1;
        //        this.salary=salary1;
        //        this.companyName=companyName1;
        //
        //    }



        //--Even if we don't create any constructor, java will create one default constructor
        //--No default methods.




        //--A Constructor can be used to initialize an object
        SDET gulsum1= new SDET();
        //--A Method consists of Java code to be executed


        //
        //--A Constructor doesn’t have a return type.
        //--A Method must have a return type.or it can be void if there isn't return
        //
        //
        //--A Constructor cannot be inherited by subclasses.
        //--A Method can be inherited by subclasses.


    }

    public int sumof2Number(int a , int b){
        return a+b;
    }
}
