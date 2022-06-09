package student.Sanjay_HR;

import java.util.Arrays;

public class lab02 {
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:
    public static void main(String[] args) {
        sameLetters("abc","cab");
        sameLetters("abc","cbb");
    }
    public static String sameLetters(String a, String b){
        String result="";
        System.out.println("String a = "+a+ " String b = "+b);
        char[] ch1=a.toCharArray();
        Arrays.sort(ch1);
        //System.out.println(ch1);
        char[] ch2=b.toCharArray();
        Arrays.sort(ch2);
        //System.out.println(ch2);
        System.out.println("sameLetters = "+Arrays.equals(ch1,ch2));
        return result;
        }
}
