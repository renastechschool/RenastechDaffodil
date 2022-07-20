package Buket;

import java.util.Scanner;

public class lab21 {

    // Lab 21 - (Numbers) Divide without / operator
// Write a method that can divide two numbers without using division operator

//import java.util .*;


    public static void divide(int num1, int num2) {

        int result = 0; //variable declaration

        while (num1 >= num2) {
            num1 = num1 - num2;
            result++;

        }
        System.out.println("Result is:" + result);
    }

    public void main(String[] args) {

        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to divide: ");
        x = sc.nextInt();
        System.out.print("Enter divisor value: ");
        y = sc.nextInt();

        divide(x, y);

    }
}


