package student.Firat;

import java.util.ArrayList;
import java.util.Arrays;

public class lab05 {
    public static void main(String[] args) {
        //Write a method that can find the maximum number from an int Array
         ArrayList<Integer> number = new ArrayList<>();
         number.addAll(Arrays.asList(1,2,3,62,1903));
        System.out.println(maximum(number));

    }


    public static Integer maximum( ArrayList<Integer> number ){

        Integer max = Integer.MIN_VALUE;
        for (Integer i = 0; i < number.size(); i++) {
            if (number.get(i)>max){
               max = number.get(i);
            }

        }

        return max;
    }




}
