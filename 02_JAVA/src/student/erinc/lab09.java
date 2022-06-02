package student.erinc;

import java.util.Arrays;

public class lab09 {
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //         arr = Sort(arr); ==> {90, 20, 10, 8, 7};

    public static void main(String[] args) {
        int [] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortNumbers(arr)));
       }

    public static int [] sortNumbers(int [] numbers){
        int number = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {

                    number = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = number;   }
            }
        }

        return numbers;
    }
}
