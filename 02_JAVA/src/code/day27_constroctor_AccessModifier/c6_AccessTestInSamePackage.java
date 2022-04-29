package code.day27_constroctor_AccessModifier;

public class c6_AccessTestInSamePackage {

    public static void main(String[] args) {
        //to be able to call instance variable we need to create ann object

        c5_AccessModifiers obj1=new c5_AccessModifiers();
        //we crete an object from class with help of constroctor

      // System.out.println("obj1.privateVariable = " + obj1.privateVariable);
        System.out.println("obj1.publicVariable = " + obj1.publicVariable);
        System.out.println("obj1.protectedVariable = " + obj1.protectedVariable);
        System.out.println("obj1.defaultVariable = " + obj1.defaultVariable);

        //priavete will have access only in same class
    }


}
