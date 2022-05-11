package code.day30_Exceptions;

public class c8_FinalVariables {

    //differences between finally and final keyword

    //finally is used with try catch block and it will get executed always

    //final keyword is used to make things not changable

    int instanceVariable;
    static int staticVariable;

    final int instanceVrbl2=100;
    final static int staticVrbl2=200;

    public static void main(String[] args) {
        staticVariable =10 ;
        c8_FinalVariables obj1=new c8_FinalVariables();
        obj1.instanceVariable=20;

//        obj1.instanceVrbl2=500;
//        staticVrbl2=300;
        //final keyword will make variable not changable
    }
}
