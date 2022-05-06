package student.Firat;

import java.util.ArrayList;

public class lab19 {
    //Write a return method that returns the  Fibonacci of any given number
    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }


    public static ArrayList<Integer> Fibonacci(int endingPoint){
       ArrayList<Integer> FibonacciArray = new ArrayList<>();
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 0; i <= endingPoint; i++) {
            FibonacciArray.add(firstTerm);

            int nextTerm = firstTerm+ secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return FibonacciArray;
    }




}
