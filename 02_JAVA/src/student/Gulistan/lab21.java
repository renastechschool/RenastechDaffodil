package student.Gulistan;
// Write a method that can divide two numbers without using division operator
public class lab21 {

    public static void main(String[] args) {
       divide(13,2);    //++
       divide(11,0);    // 0
    }

    public static void divide(int a, int b) {
        int counter = 0;

        if (b == 0)// 0
            System.out.println("The second number can not be zero");
        else {
               while (a >= b) {//++
                    a -= b;
                    counter++;
               }
            System.out.println("Division is " + counter +
                    ", Remain is " + a);
            }

    }
}
