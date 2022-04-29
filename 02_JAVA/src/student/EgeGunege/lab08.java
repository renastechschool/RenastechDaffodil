package student.EgeGunege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab08 {
    public static ArrayList sortArray(ArrayList list){
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(38,15,2,3,33,21,14,12));
        System.out.println(sortArray(list2));
    }
}
