package student.Mukaddes;

public class lab21 {
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args)
    {
        int dividend = 21;
        int divisor = 4;

        System.out.println("The quotient is " + divide(dividend, divisor));
    }
    public static int divide(int x, int y) {
        if (y == 0) {
            return 0;
        }
        int quotient = 0;
        while (x >= y)
        {
            x = x - y;
            quotient++;
        }
        System.out.println("The remainder is " + x);
        return quotient;
    }

}
