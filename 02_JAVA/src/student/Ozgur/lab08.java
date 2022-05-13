package student.Ozgur;

import java.util.Arrays;

public class lab08 {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:
    //      int[] arr = {10, 9, 8, 7};
    //
    //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};


    public static void main(String[] args) {


        int[] arr = {10, 9, 3, 8, 5, 7};



    int number = 0;
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
        if (arr[i] < arr[j]) {

        number = arr[i];
        arr[i] = arr[j];
        arr[j] = number;

        }
        }
        }
       System.out.println(Arrays.toString(arr));
        }
      }




