package student.Gulistan;

import java.util.Arrays;

public class lab02 {
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false

    public static void main(String[] args) {
        System.out.println(checkString("abcd","cabd"));
    }

    public static boolean checkString(String string1, String string2) {
        char[] first = string1.toCharArray();
        char[] second = string2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        boolean flag = Arrays.equals(first, second);

        return flag;

    }
}
