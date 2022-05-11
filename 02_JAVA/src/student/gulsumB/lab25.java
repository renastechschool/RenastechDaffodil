package student.gulsumB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Write a method that can sort
  //      the ArrayList in Ascending order without using the sort method
public class lab25 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(45,7862,85,48,52,9,7,745,854,52));
        for (int i = 0; i <numbers.size() ; i++) {
            for (int j= numbers.size()-1;j>i;j--) {
                if(numbers.get(i)>numbers.get(j)){
                    Integer temp= numbers.get(i);
                numbers.set(i, numbers.get(j));
                numbers.set(j,temp);
                }
            }
        }for(int i:numbers){
            System.out.println(i);


        }
        }


}
