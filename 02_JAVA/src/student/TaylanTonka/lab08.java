package student.TaylanTonka;

import java.util.Arrays;

public class lab08 {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:
    //      int[] arr = {10, 9, 8, 7};
    //
    //       arr = Sort(arr);     ==>{ 7, 8, 9, 10};
    public static void main(String[] args) {
        int[] arr= {10,9,8,7};

        System.out.println("Sort(arr) = " + Arrays.toString(Sort(arr)));
    }


    public static int[] Sort(int[] a)
    {
        boolean isSorted = false;

        while(!isSorted)
        {
            isSorted=true;
            int temp = 0;
            for(int i =0;i<a.length-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    isSorted=false;
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        return a;
    }
}
