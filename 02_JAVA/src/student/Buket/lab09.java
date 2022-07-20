package Buket;

public class lab09 {
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //         arr = Sort(arr); ==> {90, 20, 10, 8, 7};

    public static int[] sortArrayDes(int[] a) {

        int[] result = new int[a.length];
        int tmp = 0;

        //sorting logic
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){

                if (a[i] < a[j]){

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

        int[] a = {10, 20, 7, 8, 90};

        int[] ab = sortArrayDes(a);
        System.out.print("Sorted Array: ");

        for( int i = 0; i< ab.length; i++){
            System.out.print( ab[i]+ " ");
        }

    }
}



