package student.Sanjay_HR;

import java.util.Arrays;

public class lab06 {
    //Write a method that can find the minimum number from an int Array
    public static void main(String[] args) {
        int [] numbers={1,2,3};
        minNumber(numbers);
    }
    public static int minNumber(int[] number){
        System.out.println("int Array = "+Arrays.toString(number));
        int min=number[0];
        for (int i = 0; i < number.length; i++) {
            if(min>number[i]){
                min=number[i];
            }
        }
        System.out.println("Minimum = "+min);
        return min;
    }
}
