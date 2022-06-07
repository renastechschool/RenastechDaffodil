package student.erinc;

import java.util.ArrayList;
import java.util.Arrays;

public class lab25 {

    public static void main(String[] args) {
       // Write a method that can sort the ArrayList in Ascending order without using the sort method

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,2,54,3,24));
        for (int i = 0; i < list.size(); i++) {

            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) > list.get(j)) {

                    int tmp = list.get(i);
                    list.set(i,list.get(j)) ;
                    list.set(j,tmp);

                }

            }

        }
        for (int i: list) {
            System.out.println(i);
        }








        }
}
