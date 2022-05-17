package student.Gulistan;

import java.util.Scanner;

public class Lab01 {
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");

        reverseMethod(scanner.next());
    }

    private static void reverseMethod(String input){
        char [] myChar = input.toCharArray();
        String reverse="";

        for (int i = myChar.length-1; i >= 0; i--) {
            reverse += myChar[i];
        }
        System.out.println(reverse);
    }
}