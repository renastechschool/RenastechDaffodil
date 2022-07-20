package student.Ulzana;

public class    lab19 {

    public static void main(String[] args) {


        System.out.println(fibonacciNumbers(2));
        System.out.println(fibonacciNumbers(6));
        System.out.println(fibonacciNumbers(9));
    }

//Write a return method that returns the  Fibonacci of any given number

    public static String fibonacciNumbers (int print_From_Zero_To_){

        String result="";
    int firstResult =0;
    int secondResult =1;
    int thirdResult =0;
            for (int i = 1; i <=print_From_Zero_To_; i++) {
                    result += firstResult+". ";

              thirdResult = firstResult + secondResult;
              firstResult = secondResult;
              secondResult = thirdResult;   }

    return "Fibonacci numbers: "+ result; }






}
