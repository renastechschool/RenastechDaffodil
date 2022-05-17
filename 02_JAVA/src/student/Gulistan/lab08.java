package student.Gulistan;

import java.util.Arrays;

public class lab08 {
    //Write a return method that can sort an int array in Ascending order
    // without using the sort method of the Arrays class
    //Ex:
    //      int[] arr = {10, 9, 8, 7};
    //
    //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};

    private static int[]  sortInt(int[] myArray){
        int temp;
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = i+1; j < myArray.length ; j++) {
                if (myArray[i] > myArray[j]){
                    temp= myArray[i];
                    myArray[i]=myArray[j];
                    myArray[j]=temp;
                }
            }
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] myArray= {7,1,5,3,11};
        System.out.println(Arrays.toString(sortInt(myArray)));
    }
}
