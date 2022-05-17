package student.ezgi;

import java.util.Scanner;

public class lab01 {
    //## Lab 01 - //(String) Reverse
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {

       System.out.println(reverseWord(""));
    }


    public static String reverseWord (String word){
        Scanner input=new Scanner(System.in);
        System.out.println(" Please enter a word = ");
        word=input.nextLine();
        String result="";

        for (int i = word.length()-1; i >=0 ; i--) {

         result+=word.charAt(i);

        }
        return result;
    }


}
