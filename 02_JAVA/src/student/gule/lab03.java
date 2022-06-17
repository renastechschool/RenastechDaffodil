package student.gule;
//Lab 03 -  //(String) Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex: removeDup("AAABBBCCC") ==> ABC

import java.util.LinkedHashSet;
import java.util.Set;

public class lab03 {

    public static void main(String[] args) {

        System.out.println(removeDup("GGGUULLEEE"));
    }

    public static String removeDup(String remove){

        char [] test = remove.toCharArray(); //[A,A,A,B,B,B,C,C,C]
        Set<Character> name = new LinkedHashSet<>(); // LinkedHashset follows order the any data type.
        for (char ch: test) {
            name.add(ch); //[A,B,C]
        }
        String newString = "";
        for (char ch1:name) {
            newString = newString+ch1;
        }
        return newString;

    }
}
