package student.sezar.Ulzana;

import java.util.Scanner;

public class lab18 {

    public static void main(String[] args) {

        System.out.println(factorialNumber(3));
        System.out.println(factorialNumber(5));
        System.out.println(factorialNumber(6));
    }

    //Write a return method that returns the factorial number of any given number
    //Input: 5   outPut: 120

    public static int factorialNumber(int number){
        int factNumber =1;
            for (int i = 1; i <=number; i++) {
                factNumber *= i ;  }
        return factNumber;}






}
