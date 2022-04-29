package student.gulsumB;

import java.util.Scanner;

//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
// print "FIN" instead of the number and for numbers which are a multiple of 5,
// print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
// print "FINRA" instead of the number.
public class lab10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number :");
        int num= input.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("FinRa");
        }else if(num%3==0){
            System.out.println("Fin");
        }else if(num%5==0){
            System.out.println("RA");
        }

    }
}

