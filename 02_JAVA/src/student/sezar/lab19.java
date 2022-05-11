package student.sezar;

public class lab19 {
    public static void main(String[] args) {
        //Write a return method that returns the  Fibonacci of any given number
        int input = 3;
        fibonacci(input);
    }

    public static void fibonacci(int a)
    {
        int[] fibo = {1,1};

        for(int i =0;i<a-2;i++)
        {
            int temp =0;
            temp = fibo[0] + fibo[1];
            fibo[0] = fibo[1];
            fibo[1] = temp;
        }
        System.out.println(fibo[1]);
    }
}