package student.suleyman;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class lab25 {

   // Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static void main(String[] args) {

        ArrayList<Integer>number=new ArrayList<>();

        number.addAll(Arrays.asList(10,20,30,40,50,60,70,80));
        for (int i = 0; i <number.size() ; i++) {
            for (int j = number.size()-1;  j>i ; j--) {
                if (number.get(i) > number.get(j)){
                    Integer temp= number.get(i);
                    number.set(i, number.get(j));
                    number.set(j, temp);
                }
            }
        }
        for (int j = 0; j <number.size() ; j++) {
            System.out.print(" "+ number.get(j) + " ");
        }
    }

}
