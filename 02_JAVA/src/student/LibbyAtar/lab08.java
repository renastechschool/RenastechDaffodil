package student.LibbyAtar;

import java.util.Arrays;

public class lab08 {

    public static void main(String[] args) {
        //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        //Ex:
        //      int[] arr = {10, 9, 8, 7};
        //
        //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};

        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(ascend(arr)));
        }

public static int[]ascend(int[]ascend){
       int num=0;
    for (int i = 0; i  < ascend.length ; i++) {
        for (int j = 0; j <ascend.length ; j++) {
            if (ascend[i]<ascend[j]){
                num=ascend[i];
                ascend[i]=ascend[j];
                ascend[j]=num;
            }
        }}
    return ascend;



}}
