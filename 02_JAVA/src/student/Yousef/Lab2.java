package student.Yousef;

import java.util.Arrays;

public class Lab2 {
    public static void main(String[] args) {
        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:
        System.out.println(letters("abc","cab"));
        System.out.println(letters("abc","abb"));

    }
    public static boolean letters(String first,String second){


        char []  firstString= first.toCharArray();
        char [] secondString= second.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        boolean result= Arrays.equals(firstString,secondString);


        return result;
    }
}

