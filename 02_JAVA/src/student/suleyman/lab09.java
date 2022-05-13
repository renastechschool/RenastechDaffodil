package student.suleyman;

import java.util.Arrays;

public class lab09 {

    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //         arr = Sort(arr); ==> {90, 20, 10, 8, 7};


    public static void main(String[] args) {


        boolean isSorted = false;
        int[] arr = {10, 9, 8, 7};
        while(!isSorted)
        {
            isSorted = true;
            int temp;
            for(int i =0;i< arr.length-1;i++)
            {
                if(arr[i]<arr[i+1])
                {
                    isSorted=false;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));

    }
}
