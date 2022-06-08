package student.Sanjay_HR;

import java.util.Arrays;

public class Lab25 {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method
    public static void main(String[] args) {
        int[] numbers={1,4,6,4,3,5};
        sortAscending(numbers);
    }
    public static int[] sortAscending(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
