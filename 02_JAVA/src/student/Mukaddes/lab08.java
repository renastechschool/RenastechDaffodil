package student.Mukaddes;

import java.util.Arrays;

public class lab08 {
    public static void main(String[] args) {
        //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        //Ex:
        //      int[] arr = {10, 9, 8, 7};
        //
        //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};

        boolean isSorted=false;
        int[] arr={10,9,8,7};
        while(!isSorted){
            isSorted=true;
            int temp;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1]){
                    isSorted=false;
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }

            }

        }
        System.out.println("arr= "+ Arrays.toString(arr));
    }

}
