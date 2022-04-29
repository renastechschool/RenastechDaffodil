package student.TaylanTonka;

import java.util.Arrays;

public class lab09 {
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //         arr = Sort(arr); ==> {90, 20, 10, 8, 7};
    public static void main(String[] args) {
        int[] arr = {10,20,7,8,90};
        System.out.println("Sort(arr) = " + Arrays.toString(Sort(arr)) );
    }

    public static int[] Sort(int[] a)
    {
        boolean isSorted= false;


        while (!isSorted)
        {
            isSorted=true;
            int temp=0;
            for(int i =0;i<a.length-1;i++)
            {
                if(a[i]<a[i+1])
                {
                    isSorted=false;
                    temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;

                }
            }
        }
        return a;
    }

}
