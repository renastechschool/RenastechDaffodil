package student.gule;
//Write a return method that can sort an int array in descending order without using
// the sort method of the Arrays class
//Ex: int[] arr = {10,20,7, 8, 90};
//         arr = Sort(arr); ==> {90, 20, 10, 8, 7};
public class lab09 {
    public static void main(String[] args) {

        int[] arr = new int[] { 10,20,7, 8, 90 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] < arr[j]) {
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
