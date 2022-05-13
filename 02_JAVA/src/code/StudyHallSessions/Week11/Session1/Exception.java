package code.StudyHallSessions.Week11.Session1;

import java.io.File;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) throws IOException {
       //Exception:
        //An event that occurs during the execution of a program that disrupts the normal flow of instructions

//        Error:
//        it is a subclass of Throwable that tells that something serious problem is existing and
//        a reasonable Java application should not try to catch that error


        //How to handle Exceptions:
        //1- try catch block
        // - Adding Exception in method singnature

        System.out.println("Renastech");

//        try {
//            Thread.sleep(2000); //InterruptedException
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }


        System.out.println("Renastech");
        System.out.println("Renastech");

        //Exceptions examples

        //OutOfIndexBound Exception

        String a="Renastech";
      //  System.out.println(a.charAt(25)); //StringIndexOutOfBoundsException


        String [] manCityPlayers={"Diaz","Mahrez","Haaland"};// len=3
        // index number           0        1         2
      //  System.out.println(manCityPlayers[5]); //ArrayIndexOutOfBoundsException


        //NullPointerException
        String str=null;
       // System.out.println(str.length());//NullPointerException
     //   System.out.println(str.charAt(8)); //NullPointerException

        //IOExecptions
        File file1=new File("user/aa/bb");

        try {
            file1.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getCause());
        }

     //   System.out.println(file1.length()); NullPointerException


        //NoSuchWebElementFound exception


        //Error Examples;
    //    method1(45); //StackOverflowError



    }
    public static void method1(int a){

        method1(a+1);
    }
}
