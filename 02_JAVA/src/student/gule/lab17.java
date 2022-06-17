package student.gule;

import java.util.ArrayList;
import java.util.Arrays;

public class lab17 {
    //Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input:  {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (! (list.get(i).equals(0))){
                list1.add( list.get(i));
            }

        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(0)){
                list1.add( list.get(i));
            }
        }

        System.out.println(list1);


    }
    }

