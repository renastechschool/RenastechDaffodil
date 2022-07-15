package Buket;

import java.util.Arrays;
import java.util.List;

public class lab25 {

    // Importing required classes
//import java.util.*;

    public static void sortDescending(List<Integer> mylist)
    {
        // Printing the current ArrayList
        System.out.println(mylist);

        for (int i = 0; i < mylist.size() - 1; i++)
        {
            for (int j = i + 1; j < mylist.size(); j++)
            {
                if (mylist.get(i) > mylist.get(j)) {

                    int temp = mylist.get(j);
                    mylist.set(j, mylist.get(i));
                    mylist.set(i, temp);
                }
            }
        }
        // Printing the modified ArrayList
        System.out.println(mylist);
    }

    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1, 21, 300, 49, 105, 96, 150, 100, 77, 112, 40);
        sortDescending(mylist);
    }

}

