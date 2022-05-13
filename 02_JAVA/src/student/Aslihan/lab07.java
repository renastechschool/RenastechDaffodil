package student.Aslihan;

import java.util.Arrays;

public class lab07 {
    //Write a return method that can concate two arrays
    public static void main(String[] args) {
        int[] list1 = {20, 30, 40, 50};
        int[] list2 = {60,70, 80, 90};
        System.out.println(concat(list1, list2));
    }
    public static String concat(int[] a, int[] b) {
        int[] con = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            con[i] += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            con[i + a.length] += b[i];
        }
        return Arrays.toString(con);
    }}
