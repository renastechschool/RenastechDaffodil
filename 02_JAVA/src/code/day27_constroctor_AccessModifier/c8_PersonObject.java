package code.day27_constroctor_AccessModifier;

public class c8_PersonObject {

    public static void main(String[] args) {
        c7_MalePerson male1=new c7_MalePerson();

        System.out.println("c7_MalePerson.isHuman = " + c7_MalePerson.isHuman);
        System.out.println("c7_MalePerson.gender = " + c7_MalePerson.gender);

        male1.name="OB";
        male1.age=32;

//        c7_MalePerson.ID
        //male1.ID

        if (c7_MalePerson.isHuman && c7_MalePerson.gender == 'M' && male1.age<55 ){
            System.out.println("Person name " +male1.name);
            System.out.println("Age " + male1.age);
            System.out.println("Person is smaller 55");
        }

    }
}
