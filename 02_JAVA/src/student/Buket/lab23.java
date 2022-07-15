package Buket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab23 {

    //Lab 23 - (ArrayList) Remove "Eric"
// Given a list of people' names: "Ahmed", "Eric", "John", "Eric", "Ahmed" , "Eric" .
// Write a java operation to remove all the names named , "Eric"

// Importing required classes
//import java.util.*;


    public static void removeValue(ArrayList<String> mylist, String s)
    {
        // Printing the current ArrayList
        System.out.println(mylist);

        while(true){
            // This makes a call to remove(Object) if value exist.
            if( mylist.contains(s)) {
                mylist.remove(String.valueOf(s));
            }
            else{
                break;
            }
        }
        // Printing the modified ArrayList
        System.out.println(mylist);
    }

    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>
                (Arrays.asList("Ahmed", "Eric", "John", "Eric", "Ahmed", "Eric"));
        String s = "Eric"; //value to remove from list
        removeValue((ArrayList<String>) mylist, s);
    }

}

