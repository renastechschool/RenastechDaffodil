package student.Destyar;

import java.util.Scanner;

public class lab19 {
    //(Numbers) Fibonacci numbers
    //Write a return method that returns the  Fibonacci of any given number

    public static void findFibonacci(int number1, int number2, int term) {

        System.out.println("Fibonacci Series till " + term + " terms:");

        for (int i = 1; i <= term; ++i) {
            System.out.print(number1 + ", ");

            // compute the next term
            int nextTerm = number1 + number2;
            number1 = number2;
            number2 = nextTerm;
        }
    }

    public static void main(String[] args) {
        int num1, num2, terms;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term of fibonacci series = ");
        num1 = sc.nextInt();
        System.out.print("Enter first term of fibonacci series = ");
        num2 = sc.nextInt();
        System.out.print("Enter total terms of series you want to find = ");
        terms = sc.nextInt();
        findFibonacci(num1, num2, terms);
    }
}


