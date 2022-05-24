package student.Yousef;

public class lab14 {
    //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        System.out.println(digitSum("k7s5"));

    }


    public static int digitSum(String str) {
        int sum = 0;

        char[] ch1 = str.toCharArray();
        for (char each : ch1
        ) {
            if (Character.isDigit(each)) {
                sum += Integer.valueOf("" + each);

            }
        }

        return sum;

    }

}
