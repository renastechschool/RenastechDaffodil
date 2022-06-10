package student.Sanjay_HR;

public class lab12 {
    //Write a method which can identifies given number is even or odd
    public static void main(String[] args) {

        oddOrEven(1);
        oddOrEven(2);
    }
    public static void oddOrEven(int a){
    if(a%2==0){
        System.out.println(a+" is an even number");
    }else if(a%2==1){
        System.out.println(a+" is an odd number");
    }else{
        System.out.println("Enter a positive whole number!");
    }
    }
}
