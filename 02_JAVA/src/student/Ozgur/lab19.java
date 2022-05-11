package student.Ozgur;

import java.util.ArrayList;
import java.util.Arrays;

public class lab19 {
    //Write a return method that returns the  Fibonacci of any given number


    public static void main(String[] args) {
        System.out.println("findingFibonnacci(9) = " + findingFibonnacci(9));

    }

    public static String  findingFibonnacci(int a){
          String result ="";
           int firstResult=0;
           int secondResult=1;
           int thirdResult=0;

        for (int i = 0; i < a; i++) {
            result+=firstResult+",";

            thirdResult=firstResult+secondResult;
            firstResult=secondResult;
            secondResult=thirdResult;

        }

        return "Fibonnacci numbers:"+result;

    }}