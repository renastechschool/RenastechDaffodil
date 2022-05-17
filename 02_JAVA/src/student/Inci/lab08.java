package student.Inci;

import java.util.Arrays;

public class lab08 {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:
    //      int[] arr = {10, 9, 8, 7};
    //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};

    public static void main(String[] args) {
        int[] arr = new int[]{20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int numbers = 0;
                if (arr[i] > arr[j]) {
                    numbers = arr[i];
                    arr[i] = arr[j];
                    arr[j] = numbers;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("" + arr[i]);

        }
    }
}










