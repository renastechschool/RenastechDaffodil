package Buket;

import java.util.Scanner;

public class lab14 {

   // ## //Lab 14 - //(String) Sum of Digits in a string
    //Write a method that can return the sum of the digits in a string

    public static void sumOfDigits(String s) {

        char[] c = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        System.out.println("Sum of Digits is : " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Please enter string to find sum of digits: ");
        s = sc.nextLine();
        sumOfDigits(s);
    }
}

