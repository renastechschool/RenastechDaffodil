package student.gulsumB;

import java.util.ArrayList;
import java.util.Arrays;

//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
public class lab24 {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<Integer>();
        num.addAll(Arrays.asList(23,50,75,580,80,153));
        System.out.println(num);
        for (int i = 0; i<num.size(); i++) {
            if(num.get(i)>100){
                num.removeAll(Arrays.asList(num.get(i)));
            }}
        System.out.println(num);
    }
}