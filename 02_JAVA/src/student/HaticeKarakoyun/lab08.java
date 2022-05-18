package student.HaticeKarakoyun;

import java.util.Arrays;

public class lab08 {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:
    //      int[] arr = {10, 9, 8, 7};
    //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(list(arr)));
    }

    public static int [] list(int [] list){
        int number = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] < list[j]) {

                    number = list[i];
                    list[i] = list[j];
                    list[j] = number;
                }
            }
        }

        return list;}

}
