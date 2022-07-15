package Buket;


public class lab08 {
//#Lab 08-  //(Array) Sort Ascending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex:
//      int[] arr = {10, 9, 8, 7};
//
//       arr = Sort(arr);     ==>{ 7, 8, 9, 10};
public static int[] sortArrayAsc(int[] a) {

    int[] result = new int[a.length];
    int tmp = 0;

    //sorting logic
    for (int i = 0; i < a.length; i++){
        for (int j = i + 1; j < a.length; j++){

            if (a[i] > a[j]){

                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        result[i] = a[i];
    }

    return result;
}

    public static void main(String[] args) {

        int[] a = {10, 9, 8, 7};

        int[] ab = sortArrayAsc(a);
        System.out.print("Sorted Array: ");

        for( int i = 0; i< ab.length; i++){
            System.out.print( ab[i]+ " ");
        }

    }
}

