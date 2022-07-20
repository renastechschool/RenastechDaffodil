package Buket;

public class lab22 {


    //Lab 22 - (Number) Reverse Negative Number
// Write a return method that can reverse negative number and return it as int

    public static int reverseNumber(int num) {
        int result = 0;
        num = num;
        while(num != 0)
        {
            int remainder = num % 10;
            result = result * 10 + remainder;
            num = num/10;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = -123;
        int result = reverseNumber(a);
        System.out.println("Original Number: "+a);
        System.out.println("Reversed Number: "+result);
    }

}
