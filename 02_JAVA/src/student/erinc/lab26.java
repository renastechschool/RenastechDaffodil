package student.erinc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab26 {

    public static void main(String[] args) {
       // Write a method that can sort the ArrayList in descending order without using the sort method



        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,2,54,3,24));

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);






    }
}
