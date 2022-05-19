package student.Mukaddes;

import java.util.ArrayList;
import java.util.Arrays;

public class lab24 {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.addAll(Arrays.asList(23, 78,209,102,67,99,12,201));

        ArrayList<Integer> removed = new ArrayList<>();
        for (int each : number){
            if (each < 100){
                removed.addAll(Arrays.asList(each));
            }
        }
        System.out.println("removed = " + removed);




    }
    }


