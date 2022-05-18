package student.HaticeKarakoyun;

import java.util.Arrays;

public class lab07 {

    public static void main(String[] args) {
        int[] list1 = {9,10,12};
        int[] list2 = {1,10,25,26};

        int length = list1.length + list2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : list1) {
            result[pos] = element;
            pos++;
        }

        for (int element : list2) {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));
    }
}
