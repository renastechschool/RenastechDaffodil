package student.sezar;

import java.util.Arrays;

public class lab8 {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:
    //      int[] arr = {10, 9, 8, 7};
    //
    //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};
    public static void main(String[] args) {
        boolean number = false;
        int[] elements = {10, 9, 8, 7};
        while (!number) {
            number = true;
            int temp;
            for (int i = 0; i < elements.length - 1; i++) {
                if (elements[i] > elements[i + 1]) {
                    number = false;
                    temp = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = temp;
                }
            }
        }
        System.out.println("arr = " + Arrays.toString(elements));
    }}
