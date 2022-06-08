package student.Sanjay_HR;

public class Lab22 {
    //Write a return method that can reverse negative number and return it as int
    public static void main(String[] args) {
        reverseNegative(-123456);
    }
    public static int reverseNegative(int number){
        int reverse=0;
        int remainder;
        System.out.println("Number = "+number);
        while(number!=0){
            remainder=number%10;
            reverse=(reverse*10)+remainder;
            number/=10;
        }
        System.out.println("Reverse = "+reverse);
        return reverse;
    }
}
