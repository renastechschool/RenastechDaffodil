package student.EgeGunege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab05 {
    public static void maxNumber(ArrayList<Integer> list){
        System.out.println(Collections.max(list));
    }

    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.addAll(Arrays.asList(11,15,33,24,2,8,29));
        maxNumber(array);
    }
}
