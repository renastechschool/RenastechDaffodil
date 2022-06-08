package student.Sanjay_HR;

public class lab18 {
    //Write a return method that returns the factorial number of any given number
    //Ex:
    //Input: 5
    //outPut: 120
    public static void main(String[] args) {
        factorial(5);
    }
    public static long factorial(long number){
        long fact=1;
        long x=1;
        String result="";
        while(x<=number){
            fact*=x;
            x++;
            result="The factorial of "+number+" is = "+fact;
        }
        System.out.println(result);
        return fact;
    }
}
