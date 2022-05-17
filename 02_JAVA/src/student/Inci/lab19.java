package student.Inci;

public class lab19 {
    //Write a return method that returns the  Fibonacci of any given number

    public static void main(String[] args) {

        fib(10);
    }

    public static int fib(int d) {

        int a = 0;
        int b = 1;
        int c=0;

        for (int i = 0; i <=d; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.println(c);
        }
            return d;

        }

    }

