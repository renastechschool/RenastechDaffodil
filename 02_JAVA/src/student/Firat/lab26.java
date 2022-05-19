package student.Firat;

import java.util.ArrayList;
import java.util.Arrays;

public class lab26 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,60,45,200,78,53,100));


        System.out.println(descending(list));


    }

    public static ArrayList descending(ArrayList<Integer>list){


        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j >i ; j--) {

                if (list.get(i)<list.get(j)){
                    int number = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,number);

                }



            }
        }





        return list;
    }


}
