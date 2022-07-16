package student.LibbyAtar;

import java.util.Arrays;

public class lab02 {
    public static void main(String[] args) {

        //    Write a program that checks if a string is build-out of the same letters as another string.
//
//    Ex:  same("abc",  "cab"); -> true
//
//    same("abc",  "abb"); -> false:

                sameLetters("abc", "cba");
                System.out.println(sameLetters("abc", "cba"));
                sameLetters2("cba","abb");
                  System.out.println(sameLetters2("cba","abb"));

            }

            public static boolean sameLetters(String letters, String letters2) {
                char[] x = letters.toCharArray();
                char[] z = letters2.toCharArray();
                Arrays.sort(x);
                Arrays.sort(z);
                boolean a = Arrays.equals(z, x);

                return a;

            }

    public static boolean sameLetters2(String letters2,String letters3) {
        char[] z = letters2.toCharArray();
        char[] y= letters3.toCharArray();
        Arrays.sort(z);
        Arrays.sort(y);
        boolean b=  Arrays.equals(z,y);
        return b;
        }}