package student.Gulistan;

import java.util.Arrays;

//Write a return method that can sort an int array in descending order
// without using the sort method of the Arrays class
//Ex: int[] arr = {10,20,7, 8, 90};
//         arr = Sort(arr); ==> {90, 20, 10, 8, 7};
public class lab09 {
    private static int[]  sortInt(int[] myArray){
        int temp;
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = i+1; j < myArray.length ; j++) {
                if (myArray[i] < myArray[j]){
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
