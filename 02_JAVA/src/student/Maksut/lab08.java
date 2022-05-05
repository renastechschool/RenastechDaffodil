package student.Maksut;
import java.util.ArrayList;
import java.util.Arrays;
public class lab08 {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //      int[] arr = {10, 9, 8, 7};
    //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};
    public static ArrayList<Integer> sortAscending(int[] arr) {
        ArrayList<Integer> result= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int min=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    min=arr[i];
                    arr[i]=arr[j];
                    arr[j]=min;
                }
            }
        }
        for (int k:arr){
            result.add(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9,11, 8, 7};
        System.out.println(sortAscending(arr));
    }
}
