package student.LibbyAtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class lab04 {
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {
        String unique = "AAABBBCCCDEF";


        for (int i = 0; i <unique.length() ; i++) {
             int count=0;
            for (int j = 0; j <unique.length() ; j++) {
                if (unique.charAt(i)==unique.charAt(j)){
                count++;
            }}
        if (count==1){
            System.out.println("  The Unique characters are : " +unique.charAt(i));
             }}}}