package student.Sanjay_HR;

public class lab14 {
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {
        String str = "a4v6aaa9!44";
        sumOfDigits(str);
    }
    public static int sumOfDigits(String str){
        System.out.println("Str: " + str);
        int sum = 0; int i=0;
        while (i<str.length()){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            i++;
        }
        System.out.println("Sum = "+sum);
        return sum;
    }
}
