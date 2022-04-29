package code.MyUtils;

import code.day27_constroctor_AccessModifier.c5_AccessModifiers;

public class AccessTest {

    public static void main(String[] args) {


        c5_AccessModifiers obj1 =new c5_AccessModifiers();

        System.out.println("obj1.publicVariable = " + obj1.publicVariable);
        //System.out.println(obj1.defaultVariable);
        //default cant have access outside of package
        //System.out.println(obj1.protectedVariable);
        //protected can be access from outside of package
        // (it can be access if classes are having child - parent realation )

        //System.out.println(obj1.privateVariable);
    }

}
