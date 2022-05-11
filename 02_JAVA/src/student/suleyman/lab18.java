package student.suleyman;

import java.util.Arrays;

public class lab18 {

    //Write a return method that returns the factorial number of any given number
    //Ex:
    //Input: 5
    //outPut: 120

    public static void main(String[] args) {

        System.out.println(factorialNumber(5));

    }

    public static int factorialNumber( int number){

        int result=1;
        int [] num={5};

        for (int i = 1; i <=number ; i++) {
            result=result*i;
        }
        return result;
    }
}
