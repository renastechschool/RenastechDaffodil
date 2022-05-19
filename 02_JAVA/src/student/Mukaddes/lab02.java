package student.Mukaddes;

import java.util.Arrays;

public class lab02 {


        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> fal
        public static boolean madeOutOfSameLetters(String a, String b) {
            if (a == null) {
                return b == null;
            } else if (b == null) {
                return false;
            }
            char[] left = a.toCharArray();
            char[] right = b.toCharArray();
            Arrays.sort(left);
            Arrays.sort(right);
            return Arrays.equals(left, right);
    }

    public static void main(String[] args) {
        System.out.println(madeOutOfSameLetters("abc","cab"));
        System.out.println(madeOutOfSameLetters("abc","abb"));
    }
}
