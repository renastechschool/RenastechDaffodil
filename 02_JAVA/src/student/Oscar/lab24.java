package student.Oscar;

import java.util.ArrayList;
import java.util.Arrays;

public class lab24 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,100,101,107,97,113));
        for (int i=0; i<list.size(); i++){
            if (list.get(i) >=100){
                list.remove(i);
                i--;

            }

        }
        System.out.println(list);
    }
}
