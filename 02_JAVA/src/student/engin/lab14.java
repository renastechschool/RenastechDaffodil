package student.engin;

import java.util.ArrayList;

public class lab14 {
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {
        String str = "abc123nm";
        System.out.println("sum(str) = " + sum(str));

    }
    public static int sum(String ch) {
        int sum = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) > 48 && ch.charAt(i) < 57) {
                sum += Integer.parseInt(String.valueOf(ch.charAt(i)));
            }
        }
        return sum;
    }
}
