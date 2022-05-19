package student.Mukaddes;

public class lab22 {
    //Write a return method that can reverse negative number and return it as int
    public static void main(String[] args) {
        int a=-12;
        System.out.println(reverseNegative(a));
    }
    public static int reverseNegative(int a){
        int reverse=0;
        while (a!=0){
            int reminder=a%10;
            reverse=reverse*10+reminder;
            a/=10;
        }
        return reverse;

    }
}
