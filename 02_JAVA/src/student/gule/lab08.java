package student.gule;

//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex: int[] arr = {10, 9, 8, 7};
//  arr = Sort(arr);  ==>{ 7, 8, 9, 10};

public class lab08 {
    public static void main(String[] args) {

            int[] arr = new int[] { 100, 99, 98, 97, 96 };
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int tmp = 0;
                    if (arr[i] > arr[j]) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }}}
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(" "+arr[i]);
            }
        }
    }


