package code.day26_StaticBloc_Constructor;

public class c1_StaticBlock2 {

    // static variables
    static  int a=10;
    static int a2=20;
    static  int a3=100;


    // non-static , instance variable
    int b; // as default it will int default value, which is 0
    int age=200;





    public static void main(String[] args) {

        //Becasue a and a2 have static keyword , we can direct use them
        System.out.println(a); // 10 , after static block a value will be 99 because it's in the static block.

        System.out.println(a2); // 20
        System.out.println(a3); // 100 , 89 after static block.

        //if you want to use non-static variables , we will need to create an object of the class
       // System.out.println(b);
       // System.out.println(age);
        c1_StaticBlock2 obj= new c1_StaticBlock2();

        System.out.println(obj.b); // 0

        System.out.println(obj.age); // 200

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");


      //  method2(); it will give error if you want to directly access to non static static method.

        method1();// it does not show any error

        // what shold we do to access to mathod2 which is not static.

        c1_StaticBlock2 obj2=new c1_StaticBlock2();

        obj2.method2(); // i was able to access to method2, which is not static, after creating object of the class.


    }

    static { // this is a static block, no matter where it's located.

        System.out.println("Hello Java!"); // JAVA  will print Hello Java! before everything.
        System.out.println("Hello Hello Sevgin");
         a=99;
         a3=89;


         if (400 != 200){ // true statement

             a=35; // a will be 35
             System.out.println("Hello Berkan");
         }

    }


    // this method is static because it has static keyword.
    public static void method1(){

        System.out.println("-----------------");
    }

    // non-static
    public void method2(){
        System.out.println("++++++++++++++++++++");
    }




}
