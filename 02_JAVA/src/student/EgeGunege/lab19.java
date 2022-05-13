package student.EgeGunege;

import java.util.Scanner;

public class lab19 {
    public static void fibonacci(int l){
        int number1 = 0,number2 = 1,number3=0;
        String result="";
        for (int i = 1; i<=l; ++i)
        {
            result+=number1+" ";
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;

        }
        System.out.print("First "+l+" fibonacci numbers: "+result);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number=input.nextInt();
        fibonacci(number);
    }
}
