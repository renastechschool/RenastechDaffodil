package student.suleyman;

public class lab22 {

     //Write a return method that can reverse negative number and return it as int


    public static void main(String[] args) {

        int number1=-9856;

        System.out.println("reverseNegative(number1) = " + reverseNegativeNumber(number1));
    }

    public static int reverseNegativeNumber(int  number) {

        String str = new StringBuilder(""+number).reverse().toString();

        if(number < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }

        return Integer.valueOf(str);

    }
}
