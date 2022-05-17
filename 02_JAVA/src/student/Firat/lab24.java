package student.Firat;

import java.util.ArrayList;
import java.util.Arrays;

//## Lab 24 - (ArrayList) Remove Some Values
//            Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
public class lab24 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <120 ; i++) {
            list.addAll(Arrays.asList(i));
        }

       System.out.println(values(list));


    }

    public static ArrayList values(ArrayList<Integer>list){

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)>=100){
                list.remove(i);
                i--;// this is because everytime we delete an element, the next comes in place of it so we need to check new element
            }


        }

        return list;
    }




}
