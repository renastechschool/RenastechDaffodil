package student.engin.gule;

import java.util.ArrayList;
import java.util.Arrays;

//Write a method that can sort the ArrayList in Ascending order without using the sort method
public class lab25 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(45,21,85,48,34,9,7,75,8,5));
        for (int i = 0; i <numbers.size() ; i++) {
            for (int j= numbers.size()-1;j>i;j--) {
                if(numbers.get(i)>numbers.get(j)){
                    Integer temp= numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j,temp);
                }
            }
        }for(int i:numbers){
            System.out.print(i+",");
        }
    }

    }
