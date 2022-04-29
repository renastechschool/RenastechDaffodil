package code.day27_constroctor_AccessModifier;

public class c5_AccessModifiers {

    //			Access modifiers: public, protected, default, private
    // access modifiers explain your access level to the variable ,method or class

    //Private: The access level of a private modifier is only within the class.
    // It cannot be accessed from outside the class.
    //Default: The access level of a default modifier is only within the package.
    // It cannot be accessed from outside the package.
    // If you do not specify any access level, it will be the default.
    //Protected: The access level of a protected modifier is within the package
    // and outside the package through child class.
    // If you do not make the child class, it cannot be accessed from outside the package.
    //Public: The access level of a public modifier is everywhere.
    // It can be accessed from within the class, outside the class, within the package and outside the package.


    public int publicVariable=10;  // instance public
    private int privateVariable=20; // instance priavete
    int defaultVariable=30; //// instance default
    protected int protectedVariable=40 ;  // instance protected

    public static void main(String[] args) {
        //to be able to call instance variable we need to create ann object

        c5_AccessModifiers obj1=new c5_AccessModifiers();
        //we crete an object from class with help of constroctor

        System.out.println("obj1.privateVariable = " + obj1.privateVariable);
        System.out.println("obj1.publicVariable = " + obj1.publicVariable);
        System.out.println("obj1.protectedVariable = " + obj1.protectedVariable);
        System.out.println("obj1.defaultVariable = " + obj1.defaultVariable);


    }


}
