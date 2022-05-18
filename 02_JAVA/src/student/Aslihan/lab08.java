package student.Aslihan;

import java.util.Arrays;
import java.util.Enumeration;

public class lab08 {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:
    //      int[] arr = {10, 9, 8, 7};
    //
    //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sortArray(arr)));

    }

    public static int [] sortArray(int[] a) {
        int list=0;
        for (int i=0 ;i<a.length ; i++){
            for (int k=0 ; k<a.length; k++){
                if (a[i]<a[k]){
                    list=a[i];
                    a[i]=a[k];
                    a[k]=list;
                }}}
        return a;
    }
}


