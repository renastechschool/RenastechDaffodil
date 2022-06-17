package student.Yousef;

import java.util.Arrays;

public class Lab8 {
    public static void main(String[] args) {


        //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        //Ex:
        //      int[] arr = {10, 9, 8, 7};
        //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};
        int [] arr= {10,9,8,7};

        Ascending(arr);
        System.out.println( Arrays.toString(arr));
    }

        public static int Ascending ( int[] number) {
            System.out.println(Arrays.toString(number));
            int numb = 0;
            for (int i = 0; i < number.length; i++) {
                for (int j = 0; j < number.length; j++) {


                    if (number[i] < number[j]) {

                        numb = number[i];
                        number[i] = number[j];
                        number[j] = numb;


                    }
                }

            }

            return numb;
        }
    }