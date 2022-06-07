package student.erinc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab20 {
    //Swap two variable' values without using a third variable

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);

        Collections.swap(numbers,0,1);
        System.out.println(numbers);







    }
}
