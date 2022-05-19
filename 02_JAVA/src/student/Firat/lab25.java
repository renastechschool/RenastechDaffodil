package student.Firat;

import java.util.ArrayList;
import java.util.Arrays;

//## Lab 25 - (ArrayList) sorting in ascending
//            Write a method that can sort the ArrayList in Ascending order without using the sort method
public class lab25 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,60,45,200,78,53,100));


        System.out.println(ascending(list));


    }

    public static ArrayList ascending(ArrayList<Integer>list){


        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j >i ; j--) {

                if (list.get(i)>list.get(j)){
                    int number = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,number);

                }



            }
        }





        return list;
    }




}
