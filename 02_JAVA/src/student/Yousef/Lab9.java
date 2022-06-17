package student.Yousef;

import java.util.Arrays;

public class Lab9 {
    public static void main(String[] args) {
        //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
        //Ex: int[] arr = {10,20,7, 8, 90};
        //         arr = Sort(arr); ==> {90, 20, 10, 8, 7};

        int[] n = {10, 20, 7, 8,90, 9};
        descending(n);

        System.out.println(Arrays.toString(n));

    }

    public static int descending(int[] number) {
        System.out.println(Arrays.toString(number));
        int numb = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {


                if (number[i] > number[j]) {

                    numb = number[i];
                    number[i]=number[j];
                    number[j]=numb;


                }
            }

            }
        return numb;
    }
        }
