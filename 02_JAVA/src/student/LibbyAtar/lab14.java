package student.LibbyAtar;

public class lab14 {
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {
        String letters = "Family first, Everyone else on the other side";
        System.out.println(sum(letters));
    }
    public static int sum(String string) {
        int sum= 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)>20&&string.charAt(i)<58){
                sum+=(string.charAt(i)-27);
            }
        }
    return sum;
    }}