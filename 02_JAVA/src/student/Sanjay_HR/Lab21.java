package student.Sanjay_HR;

public class Lab21 {
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args) {
        divisionWihtoutUsingOperator(20,5);
    }
    public static void divisionWihtoutUsingOperator(int a, int b){
        System.out.println(a+" / "+b);
        int c=a+b;
        int result=0;
        while(c>b){
            c-=b;
            //System.out.println(c);
            result++;
        }
        System.out.println("Result = "+result);
    }
}
