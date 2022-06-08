package student.Sanjay_HR;

public class Lab20 {
    // Swap two variable' values without using a third variable
    public static void main(String[] args) {
        swapTwoNumbers(1,2);
    }
    public static void swapTwoNumbers(int a, int b){
        System.out.println("Before swap: Number1= "+a+", Number2= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap: Number1= "+a+", Number2= "+b);
    }
}
