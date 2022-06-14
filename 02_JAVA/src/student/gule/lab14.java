package student.gule;
//Write a method that can return the sum of the digits in a string
public class lab14 {

    public static void main(String[] args) {
        System.out.println(sumOfDigits("s7t4"));
    }

    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }
}
