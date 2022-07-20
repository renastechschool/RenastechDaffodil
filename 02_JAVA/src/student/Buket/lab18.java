package Buket;

import java.util.Scanner;

public class lab18 {

    // Lab 18 //(Numbers) Factorial Number
//Write a return method that returns the factorial number of any given number
//Ex:
//Input: 5
//outPut: 120

//import java.util.Scanner;


    public static int findFactorial(int number) {

        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find factorial = ");
        num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + findFactorial(num));
    }
}



