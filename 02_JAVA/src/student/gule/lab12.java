package student.gule;

import java.util.Scanner;

//Write a method which can identifies given number is even or odd
public class lab12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println(number+ " is even number");
        }
        else{
            System.out.println(number+ " is odd number");
        }
    }
}
