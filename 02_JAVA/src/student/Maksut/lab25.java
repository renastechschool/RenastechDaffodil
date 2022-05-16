package student.Maksut;

import java.util.ArrayList;
import java.util.Arrays;

public class lab25 {
    /*
    (ArrayList) sorting in ascending
            Write a method that can sort the ArrayList in Ascending order without using the sort method
     */
    public static void main(String[] args) {
        ArrayList<Integer> givenList= new ArrayList<>(Arrays.asList(45,268,-58,0,1,90,-7,103));
        System.out.println(sortAscending(givenList));
    }

    public static ArrayList<Integer> sortAscending(ArrayList<Integer> arr) {
        ArrayList<Integer> result= new ArrayList<>();
        int max=0;
        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.size(); j++){
                int a=arr.get(i);
                int b=arr.get(j);
                if (arr.get(i)<arr.get(j)){
                    max=arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,max);}
            }
        }
        for (int k:arr){
            result.add(k);
        }
        return result;
    }
}
