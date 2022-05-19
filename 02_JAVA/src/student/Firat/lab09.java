package student.Firat;

import java.util.Arrays;

public class lab09 {
    public static void main(String[] args) {
        //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
        //Ex: int[] arr = {10,20,7, 8, 90};
        //         arr = Sort(arr); ==> {90, 20, 10, 8, 7};

        int[] arr = {10,20,7, 8, 90};
        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i]>arr[j]){

                    number = arr[i];
                    arr[i]=arr[j];
                    arr[j]=number;
                }

            }
        }
        System.out.println(Arrays.toString(arr));







    }
}
