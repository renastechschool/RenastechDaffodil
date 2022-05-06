package student.Firat;

import java.util.Arrays;

public class lab08 {
    public static void main(String[] args) {
        //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        //Ex:
        //      int[] arr = {10, 9, 8, 7};
        //
        //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};

                   //{8, 10, 3, 7, 80,99}
        int[] arr = {8, 10, 3, 7, 80,99};
            int number = 0;

            for (int i = 0; i < arr.length; i++) {
                
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        number = arr[i]; // number = 8
                        arr[i] = arr[j]; // arr[0] = 10
                        arr[j] = number; // arr[1](10) = 8 number == 8

                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
















