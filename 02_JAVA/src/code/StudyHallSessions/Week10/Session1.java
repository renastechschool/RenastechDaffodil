package code.StudyHallSessions.Week10;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class Session1 {

    public static void main(String[] args) {
        //Access modifier
        //public, private, default, protected.

        //public : It can be reached from any class and any package
        //private : access level in only same class
        //default :  access level in same package
        //protected : Access level in same package, also can have access from child class


        System.out.println(reverseString("Renastech"));
        System.out.println("********************");
        printNumberDividedBy3();


    }
    //-Create private method that will reverse given string, and try to access the method in different class and package
    private static String reverseString(String str){

        String reverse="";

        for (int i = str.length()-1; i >=0 ; i--) {

            reverse+=str.charAt(i);

        }

        return reverse;
    }

    // -Create a public method that will return list of the Even number, and and try to access the method in different class and package
    //from 0-100

    public static ArrayList<Integer> evenNumbers(){

        ArrayList<Integer> evenNumbers=new ArrayList<>();

        for (int i = 0; i <100 ; i++) {

            if (i%2==0){

                evenNumbers.add(i);
            }


        }

        return evenNumbers;


    }

    //-Create a default method that will print numbers that can be divided by 3(from 3 to 127).
    // and try to access the method in different class and package

   static void printNumberDividedBy3(){

        for (int i = 3; i <127 ; i++) {

            if (i %3 ==0){
                System.out.println(i);
            }

        }

    }

    //-Create a proteted method that will print sum of the odd numbers from any given int Array.
    // and try to access the method in different class and package

    protected static int sumOFOddNumbers(int [] array){


        int sumOfNumbers=0;

        for (int i = 0; i <array.length ; i++) {

            if (array[i] %2 !=0){

                sumOfNumbers+= array[i];
            }


        }

        return sumOfNumbers;

    }


}
