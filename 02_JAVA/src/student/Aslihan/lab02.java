package student.Aslihan;

import java.util.Arrays;

public class lab02 {
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:
    public static void main(String[] args) {
        System.out.println(sameMethod("abc", "cab"));
        System.out.println(sameMethod("abc", "abb"));
    }
    public static boolean sameMethod(String x, String y){
        boolean result=false;
        String[] xx=x.split("");
        String[] yy=y.split("");
        Arrays.sort(xx);
        Arrays.sort(yy);
        if (Arrays.toString(xx).equals(Arrays.toString(yy))) {
            result = true;
        }
        return result;
    }

}
