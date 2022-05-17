package student.Mukaddes;

public class lab18 {
    //Write a return method that returns the factorial number of any given number
    //Ex:
    //Input: 5
    //outPut: 120
    static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int num=5;
        System.out.println("factorial: "+factorial(5));
    }
}
