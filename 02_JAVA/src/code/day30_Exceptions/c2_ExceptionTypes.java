package code.day30_Exceptions;

import java.io.File;
import java.io.FileInputStream;

public class c2_ExceptionTypes {

    //Exceptions: unexpected or unwanted events
//
//	there two types of exception:
//			1.unchecked (unexpected event):If a program throws an unchecked exception,
//			it reflects some error inside the program logic
//			occures during run time
//				RuntimeException class is the parent of all exceptions
//
//			2.checked (unwanted events): In general, checked exceptions represent errors outside the
//			control of the program.
//			occurs during the compile time. needs to be handled immediatlly
    public static void main(String[] args) {

        //			1.unchecked (unexpected event):If a program throws an unchecked exception,
//			it reflects some error inside the program logic
//			occures during run time
//				RuntimeException class is the parent of all exceptions

        //System.out.println(20/0);ArrithmeticException

        String  name= "Java";
        //System.out.println(name.charAt(10));//StringIndexOutOfBoundsException

        int [] arr={3,4,5};
        //System.out.println(arr[5]);//ArrayIndexOutOfBoundsException


        ///
        //Thread.sleep(5000); //InterruptedException
        //this is checked exceptions because it gives us warning message before we run the code

        File file1=new File("Hello.txt");
        //FileInputStream fileInputStream=new FileInputStream(file1); checked exceptions


    }
}
