package student.LibbyAtar;

public class lab21 {


    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator

        int a = 21;
        int b = 2;
        int count = 0;

      //  for (int i = 0; i <= a; i++) {
          //  a = a - b;
          //  count++;
        int count2=0;
        while (a>b) {
            a -= b;
            count++;
        }
        System.out.println(count);
        System.out.println(a);
    }}
