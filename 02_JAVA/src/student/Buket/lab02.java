package student.Buket;

import java.util.Arrays;

public class lab02 {
    public static void main(String[] args) {
        //(String) Same Letters
        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false

        String one = "abc";
        String two = "cab";
        String three = "abb";

        System.out.println(same(one,three));

    }
    public static boolean same(String one,String two){
        boolean result = true;
        String [] splittedOne =one.split("");
        String [] splittedTwo =two.split("");
        Arrays.sort(splittedOne);
        Arrays.sort(splittedTwo);



        if (Arrays.equals(splittedOne,splittedTwo)){
            result = true;}
        else {
            result = false;}

        return result;


    }





}




