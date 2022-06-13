package student.Sanjay_HR;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab26 {
    //Write a method that can sort the ArrayList in descending order without using the sort method
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0,1,2,3,4,5));
        descendingOrder(numbers);
    }
    public static void descendingOrder(ArrayList<Integer> numberList){
        System.out.println("ArrayList before descending sort = "+numberList);
        Integer temp=0;
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = 0; j < numberList.size(); j++) {
                if(numberList.get(i)>numberList.get(j)){
                    temp=numberList.get(i);
                    //System.out.println(numberList);
                    numberList.set(i, numberList.get(j));
                    //System.out.println(numberList);
                    numberList.set(j, temp);
                }
            }
        }
        System.out.println("ArrayList after descending sort = "+numberList);
    }
}
