package student.Maksut;
public class lab18 {//Write a return method that returns the factorial number of any given number
    //Ex:
    //input: 5
    //outPut: 120
    public static long factorial(int given) {
        long result= 1;

        for (int i = 1; i <=given; i++) {
            result=(result*i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(20));
    }
}
