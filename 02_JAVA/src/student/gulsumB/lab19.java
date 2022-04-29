package student.gulsumB;
//Write a return method that returns the  Fibonacci of any given number
public class lab19 {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <10 ; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }
    }

}
