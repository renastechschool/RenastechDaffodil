package student.Sanjay_HR;

public class Lab19 {
    //Write a return method that returns the  Fibonacci of any given number.
    public static void main(String[] args) {
    fibonacci(25);
    }
    public static int fibonacci(int a){
        int first=1, second=1, sum;
        System.out.print("Fibonacci series(Sum of previous two numbers): "+first+", ");
        System.out.print(second+", ");
        for(int x=3; x<=a; x++){
            sum=first+second;
            System.out.print(sum+", ");
            first=second;
            second=sum;
        }
        return second;
    }
}