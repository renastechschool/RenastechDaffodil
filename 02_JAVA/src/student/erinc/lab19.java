package student.erinc;

public class lab19 {
    // //Write a return method that returns the  Fibonacci of any given number

    public static void main(String[] args) {
        System.out.println(fibonacci(345));

    }
    public static int fibonacci(int num) {

        int result = 0;
        int a = 0;
        int b = 1;

        for (int i = 1; i < num; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

}
