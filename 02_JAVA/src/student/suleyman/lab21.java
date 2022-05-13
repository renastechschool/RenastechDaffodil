package student.suleyman;

public class lab21 {

    //Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {

        System.out.println(divideNumbers(2,35));
    }
   public static boolean divideNumbers(int number1, int number2){

       if (number2==0){
           System.out.println("Invalid Number");
           return false;
       }
       System.out.println(number1 + " devided by"+ number2 + " is :");
       int count=0;

       while (number1>=number2){
           number1-=number2;
           count++;

       }

       System.out.println(count+ " and remainder is "+ number1);

       return false;
   }
}
