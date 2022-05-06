package student.Firat;

public class lab18 {
    //Write a return method that returns the factorial number of any given number
    //Ex:
    //Input: 5
    //outPut: 120
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }


    public static int factorial(int number){
        int numberOne = number;
        for (int i = numberOne-1; i >0 ; i--) {
            numberOne *=i;

        }

        return numberOne;
    }

}
