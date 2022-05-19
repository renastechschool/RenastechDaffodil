package student.LibbyAtar;

import java.util.Arrays;

public class lab06 {
    public static void main(String[] args) {
//Write a method that can find the maximum number from an int Array
        int[] numbers={1,2,3,60,45,90,100};

        Arrays.sort(numbers);


        System.out.println(Arrays.toString(numbers)); // [90, -2, 45, 87, -299, 4, 6]

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [-299, -2, 4, 6, 45, 87, 90]

        // create a method that will print max number from int array

        //first solution

        int min=numbers[0];

        for (int i=0 ; i>numbers.length; i--){

            if (numbers[i] > min){
                min =numbers[i];
            }
        }

        System.out.println("The minimum number is : " +  min);

    }

}
