package Buket;

import java.util.Scanner;

public class lab12 {

   // ## Lab 12 -  //(Numbers) Odd & Even numbers
    //Write a method which can identifies given number is even or odd

    public static void even_or_odd(int a){

        if(a % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Please enter number: ");
        num = sc.nextInt();
        even_or_odd(num);
    }
}


