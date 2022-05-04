package student.Maksut;

import java.util.ArrayList;
import java.util.Arrays;

public class lab09 { //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //         arr = Sort(arr); ==> {90, 20, 10, 8, 7};

    public static ArrayList<Integer> sortDescending(int[] arr) {
        ArrayList<Integer> result= new ArrayList<>();
        int max=0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i]>arr[j]){
                    max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;}
            }
        }
        for (int k:arr){
            result.add(k);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(sortDescending(arr));
    }
}
