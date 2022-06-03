package student.erinc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab24 {
   // Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,43,101,200,4));
        List<Integer> newList=new ArrayList<>();

        for (Integer each: list) {
            if (each<100){
                newList.add(each);
            }
        }
        System.out.println(newList);





    }
}
