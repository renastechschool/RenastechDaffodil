package student.Maksut;
public class lab21 {
    /*
    (Numbers) Divide without / operator
            Write a method that can divide two numbers without using division operator
     */

    public static int divide(int a,int b){
        int count = 0;
        while (a > b){
            a -= b;
            count++;
        }
        //a is remainder(left over).
        return count;
    }
    public static void main(String[] args) {
        System.out.println(divide(21, 2));
    }
}
