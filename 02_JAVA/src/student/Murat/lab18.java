package student.Murat;

import java.util.Scanner;

//Write a return method that returns the factorial number of any given number
//Ex:
//Input: 5
//outPut: 120
public class lab18 {
    public static void main(String[] args) {
        int number= 4 ;
        int answer= 1 ;

        for (int i= 1; i<=4; i++ ){
            answer *=i;
        }  System.out.println("answer == " +answer);



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        int value = scanner.nextInt();

        int factorial = 1;

        for (int i=1; i<=value;i++){

            factorial = factorial*=i;
        }

        System.out.println("Facotial number is "+factorial);


    }
}
