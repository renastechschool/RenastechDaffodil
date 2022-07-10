package student.Murat.erinc;

public class lab18 {

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    public static int factorial(int number){

        int fact=1;

        for (int i = 1; i <=number ; i++) {
            fact=fact*i;

        }



        return fact;
    }



}
