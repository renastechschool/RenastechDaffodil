package student.Gulistan;
//Write a return method that returns the factorial number of any given number
//Ex:
//Input: 5
//outPut: 120
public class lab18 {

    private static int factorial(int number){
        int result  =1;

        while(number > 0){
            result *=number;
            number--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
