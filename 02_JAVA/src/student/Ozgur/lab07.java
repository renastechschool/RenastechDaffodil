package student.Ozgur;

import java.util.Arrays;

public class lab07 {
    //Write a return method that can concate two arrays

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        System.out.println("concte(a,b) = " + concte(a, b));
    }

    public static String concte(int[] a, int[] b) {
        int[] twoOfThem = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            twoOfThem[i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            twoOfThem[a.length + i] = b[i];

        }

return Arrays.toString(twoOfThem);

    }

}