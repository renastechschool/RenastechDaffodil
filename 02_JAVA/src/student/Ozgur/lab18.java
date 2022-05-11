package student.Ozgur;

public class lab18 {
    //Write a return method that returns the factorial number of any given number
    //Ex:
    //Input: 5
    //outPut: 120
    public static void main(String[] args) {
        System.out.println("findingFactorial(5) = " + findingFactorial(5));
    }

    public static int findingFactorial(int a){

        int result=1;

        for (int i = a; i >=1 ; i--) {

            result*=i;

        }

        return result;
    }
}
