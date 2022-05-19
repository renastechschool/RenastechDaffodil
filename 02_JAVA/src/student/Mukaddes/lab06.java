package student.Mukaddes;

import java.util.Arrays;

public class lab06 {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int[] num={9998,999,9997,99399};
        Arrays.sort(num);
        System.out.println("max : "+num[num.length-1]);

    }
}
