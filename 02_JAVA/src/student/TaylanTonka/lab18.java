package student.TaylanTonka;

public class lab18 {
    //Write a return method that returns the factorial number of any given number
    //Ex:
    //Input: 5
    //outPut: 120
    public static void main(String[] args) {
        int input =5;
        factorial(input);
    }
    public static void factorial(int a)
    {
        int sum =1;
        for(int i=1;i<=a;i++)
        {
            sum *= i;
        }
        System.out.println("Factorial = "+sum);
    }

}
