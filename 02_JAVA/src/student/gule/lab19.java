package student.gule;
//Write a return method that returns the  Fibonacci of any given number
public class lab19 {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        int z;

        for (int i = 0; i <10 ; i++) {
            z=x+y;
            x=y;
            y=z;
            System.out.print(z+",");

        }
    }





}
