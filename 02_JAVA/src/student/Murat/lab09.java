package Murat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab09 {
    public static ArrayList sortArray(ArrayList list) {
        Collections.sort(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add((Integer) list.get(i));
        }
        return list2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(38, 15, 2, 3, 33, 21, 14, 12));
        System.out.println(sortArray(list3));
    }
}
