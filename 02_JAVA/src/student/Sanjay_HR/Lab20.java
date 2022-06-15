package student.Sanjay_HR;

public class Lab20 {
    //Swap two variable' values without using a third variable
    public static void main(String[] args) {
        swapWithoutThirdVariable(10,20);
    }
    public static void swapWithoutThirdVariable(int a, int b){
        System.out.println("Number 1 = "+a+ " Number 2 = "+b);
        a+=b;
        b=a-b;
        a=a-b;
        System.out.println("Number 1 = "+a+ " Number 2 = "+b);
    }
}
