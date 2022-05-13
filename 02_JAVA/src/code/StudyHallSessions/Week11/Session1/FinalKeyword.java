package code.StudyHallSessions.Week11.Session1;

public  class FinalKeyword {


    public static void main(String[] args) {

        //Final---> A non-access modifier used for classes,
        // attributes and methods, which makes them non-changeable (impossible to inherit or override)

        final  String scholname="Renastech";
        System.out.println(scholname);

       // scholname="Renastech"; We will get an error because it is a final variables

        int a=90;
        System.out.println(a);

        a=100;
        System.out.println(a); //100

        final int b=40;
        System.out.println(b);

       // b=45;
        System.out.println(b); //cannot assign a value to final variable b

      //  printName(); //my name is Renastech


        /**
         * development environment: https://hrm-dev.renastechschool.com/
         *
         * testing environment   : https://hrm-test.renastechschool.com/
         * staging environment   : https://hrm-stg.renastechschool.com/

         */


    }

    public final  void printName(){
        System.out.println("my name is Renastech");
    }

    public final void printName(String str){

        System.out.println("my name is "+str);
    }
}
