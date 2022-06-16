package student.Yousef;

import java.util.Arrays;

public class Lab5 {
    public static void main(String[] args) {
        //Write a method that can find the maximum number from an int Array

        int [] numbers= {1,2,3,10,7,4,5,6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int max= numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max) max=numbers[i];

        }
        System.out.println(max);


    }
}
