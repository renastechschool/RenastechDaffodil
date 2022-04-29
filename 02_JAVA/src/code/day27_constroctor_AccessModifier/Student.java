package code.day27_constroctor_AccessModifier;

public class Student {

    //name // id //age //grade //schoolname

    String name; // instance
    int id ;
    static String schoolName; //static

     static int countNumbers=0;
    //access modifier and class name to create a constroctor
    //if we dont have  any constrocto java will have a default constructor
//    public Student(){
//
//    }

    public Student(String name){
        this.name=name;
        id = setStudentNumber();

    }


    //create a method that will set student id automatically
    public  int setStudentNumber(){
        countNumbers++;//2
        return countNumbers;
    }

    public void getInfo(){
        System.out.println("Name : " + name);
        System.out.println("id : " +id);
        System.out.println("school name " + schoolName);
    }

    public static void setSchoolName(String school){
        schoolName =school;
    }
}
