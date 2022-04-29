package student.suleyman;

import java.util.Arrays;

public class lab02 {

    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static boolean madeOutOfSameLetters(String word1, String word2){


        char [] first=word1.toCharArray();
        char [] second=word2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {

        System.out.println(madeOutOfSameLetters("abcdef", "suleyman"));
        System.out.println(madeOutOfSameLetters("kalem", "melak"));
        System.out.println(madeOutOfSameLetters("kal", "lak"));
        System.out.println(madeOutOfSameLetters("abc", "bca"));
        System.out.println(madeOutOfSameLetters("tomorrow","morrowot"));
    }
}
