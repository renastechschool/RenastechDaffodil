package student.Ulzana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab25 {
    public static void main(String [] args){

        List<Integer> list= new ArrayList<>(Arrays.asList(23,56,776,0,-9,24));
        sortAscending(list);
    }




    public static void sortAscending( List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {

                    Integer first = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, first);       }}}

        System.out.println(list);  }

}