package student.Murat;

public class lab21 {
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args){
        int dividend = 21;
        int divisor = 4;

        System.out.println("The quotient is " + divide(dividend, divisor));
    }
    public static int divide(int x, int y) {
        if (y == 0) {
            return 0;
        }

        int quotient = 0; // x= 21 y=4 >> ex  5;

        while (x >= y) {// 21 >=4 , 17 >=4 , 13 >=4, 9 >=4 , 5>=4, 1>=4
            x = x - y; // x=> 21-4 >17 , x=17-4 =13 , 13-4=9, 9-4=5 , 5-4=1
            quotient++; //0++ >1 , 1++>2, 3 , 4 , 5
        }
        System.out.println("The remainder is " + x);

        return quotient;//5
    }
}
