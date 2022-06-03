package student.erinc;

import java.util.Arrays;

public class lab02 {
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false

    public static void main(String[] args) {

        sameLetters("abc", "acb");
        sameLetters("abc", "acc");
        sameLetters("abcd", "abc");


    }

    public static void sameLetters(String str, String str2) {

        String[] split1 = str.split("");
        String[] split2 = str2.split("");

        Arrays.sort(split1);
        Arrays.sort(split2);


        if (str.length() == str2.length() && Arrays.toString(split1).equals(Arrays.toString(split2))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
