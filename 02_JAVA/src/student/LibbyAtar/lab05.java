package student.LibbyAtar;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;

public class lab05 {

    public static void main(String[] args) {
       //Write a method that can find the maximum number from an int Array

        int[] numbers={1,2,3,60,45,90,100};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [5, 24, 25, 89, 100]

        int length=numbers.length;

        int maxNumber=numbers[length-1];

        System.out.println("The max number is : " + maxNumber);

    }



}
