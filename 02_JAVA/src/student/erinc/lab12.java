package student.erinc;

import java.util.Scanner;

public class lab12 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number= input.nextInt();

        if (number%2==0){
            System.out.println(number+" : Even Number");
        }else {
            System.out.println(number+" : Odd Number");
        }





    }
}
