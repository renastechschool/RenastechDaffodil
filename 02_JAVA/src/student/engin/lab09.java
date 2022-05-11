package student.engin;

import java.util.Arrays;

public class lab09 {
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//Ex: int[] arr = {10,20,7, 8, 90};
//         arr = Sort(arr); ==> {90, 20, 10, 8, 7};

public static void main(String[] args) {
    int[] arr = {10,20,7,8,90};
    System.out.println(Arrays.toString(ascanding(arr)));

}

public static int[] ascanding(int[] arr)
{
    boolean isSwapped= false;
    while (!isSwapped) {
        isSwapped=true;
        int temp=0;
        for(int i =0;i<arr.length-1;i++) {
            if(i+1<arr.length   && arr[i]<arr[i+1]) {
                isSwapped=false;
                temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
    }
    return arr;
}
}
