package student.gule;
 //Write a method that can divide two numbers without using division operator
public class lab21 {
     public static void main(String[] args)     {
         int dividend = 78;
         int divisor = 5;
         System.out.println("The quotient is " + divide(dividend, divisor));     }
     public static int divide(int x, int y) {
         if (y == 0) {
             System.out.println("Divisible by 0");
         }
         int sign = 1;
         x = Math.abs(x);
         y = Math.abs(y);
         int quotient = 0;
         while (x >= y) {
             x = x - y;
             quotient++;
         }
         System.out.println("The remainder is " + x);
         return sign * quotient;
     }
 }
