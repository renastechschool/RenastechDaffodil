package Buket;

import java.util.Arrays;
import java.util.List;

public class lab24 {

    // Lab 24 - (ArrayList) Remove Some Values
// Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.


// Importing required classes
//import java.util.*;


    public static void removeValue(List<Integer> mylist)
    {
        // Printing the current ArrayList
        System.out.println(mylist);
        int listsize = mylist.size();
        int temp, ind;
        ind = 0;
        for (int i = 0; i <= listsize - 1; i++)
        {
            if(mylist.get(i) >= 100) {
                ind++;
                temp = i;
                for (int j = i+1; j < listsize; j++) {

                    mylist.set(i, mylist.get(j));
                    i++;
                }
                i = temp - 1;
            }
        }
        // Printing the modified ArrayList
        System.out.print("[");
        for( int k = 0; k < listsize - ind; k++){
            System.out.print(mylist.get(k)+", ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1, 21, 300, 49, 105, 96, 150, 100, 77, 112, 40);
        removeValue(mylist);
    }

}

