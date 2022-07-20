package student.Oscar;

public class lab09 {
    public static void main(String[] args) {
        int[] arr = {3, 9, 7, 27, 11, 1};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            System.out.println(arr[i]);
        }
    }
}
