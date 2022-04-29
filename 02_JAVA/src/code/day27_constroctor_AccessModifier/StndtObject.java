package code.day27_constroctor_AccessModifier;

public class StndtObject {

    public static void main(String[] args) {

        Student.setSchoolName("RenasTech");


        Student obj1=new Student("student 1 ");
                       //Student()
        obj1.getInfo();
        //1


        Student obj2=new Student("Student 2");
        obj2.getInfo();
        //2


        Student obj3 =new Student("Studnet3");
        obj3.getInfo();

        //3

    }
}
