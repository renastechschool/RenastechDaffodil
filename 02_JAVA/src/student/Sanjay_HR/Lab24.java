package student.Sanjay_HR;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab24 {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {
        ArrayList<Integer>intList = new ArrayList<>();
        intList.addAll(Arrays.asList(1,2,3,4,5,6,99,150,250,350));
        removeValuesMoreThan100(intList);
    }
    public static ArrayList removeValuesMoreThan100(ArrayList<Integer> intList){
        System.out.println("intList = "+intList);
        int i=0;
        while(i< intList.size()) {
            if (intList.get(i) > 100) {
                intList.remove(i);
                i=0;
            }
            i++;
        }
        System.out.println("intList after removing values greater than 100 = "+intList);
        return intList;
    }
}
