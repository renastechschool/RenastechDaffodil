package student.Inci;

import java.util.Arrays;

public class lab03 {
    // (String) Remove Duplicates
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {

        System.out.println(duplicates("AAABBBCCC"));
    }
    public static String duplicates (String name) {

        String result ="";

        for (int i = 0; i <name.length() ; i++) {
            if (! (result.contains(""+name.charAt(i)))){
                result += name.charAt(i);}}
        return result;
            }

        }






