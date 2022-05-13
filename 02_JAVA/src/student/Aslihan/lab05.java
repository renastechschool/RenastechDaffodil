package student.Aslihan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab05 {
    public static void maxNumber(ArrayList<Integer> list){
        System.out.println(Collections.max(list));
    }
    public static void main(String[] args){
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(90,70,500,-200,150,99));
        maxNumber(list2);
    }
}
