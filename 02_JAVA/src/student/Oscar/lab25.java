package student.Oscar;

import java.util.ArrayList;
import java.util.Arrays;

public class lab25 {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754));


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int tmp = list.get(i);
                if (list.get(i) < list.get(j)) {
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }

            }

        }

        System.out.println(list);


        }
    }



