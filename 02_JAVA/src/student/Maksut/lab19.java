package student.Maksut;
public class lab19 {  //Write a return method that returns the  Fibonacci of any given number
    public static long fibonacci(int given) {
        long result = 0;
        long firstTerm = 0;
        long secondTerm = 1;

        if (given == 2) {
            result = 1;
        } else if (given > 2) {
            for (int n = 1; n < given - 1; n++) {

                result = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(57));
    }
}
