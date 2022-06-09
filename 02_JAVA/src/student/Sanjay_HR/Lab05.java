package student.Sanjay_HR;

import java.util.Arrays;

public class lab05 {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int [] numbers={1,2,3};
        maxNumber(numbers);
    }
    public static int maxNumber(int[] number){
        System.out.println("int Array = "+Arrays.toString(number));
        int max=number[0];
        for (int i = 0; i < number.length; i++) {
            if(max<number[i]){
                max=number[i];
            }
        }
        System.out.println("Minimum = "+max);
        return max;
    }
}
