package student.Maksut;

import java.util.ArrayList;

public class lab24 {
    /*
    (ArrayList) Remove Some Values
            Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {
        ArrayList<Integer> givenList=new ArrayList<>();
        for (int i = 1; i < 110; i++) {givenList.add(i);}

        System.out.println(removeAfter100(givenList));

    }

    public static ArrayList<Integer> removeAfter100(ArrayList<Integer> givenList) {
        ArrayList<Integer> result=new ArrayList<>();
        for (int each:givenList) {
            if (each<=100){result.add(each);}
        }
        return result;
    }
}
