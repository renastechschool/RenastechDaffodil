package student.suleyman;

import java.util.ArrayList;
import java.util.Arrays;

public class lab24{

    // Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {


        ArrayList<Integer>number1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,100,200,300,400,500,600));

        ArrayList<Integer>number2=new ArrayList<>();

        for (int each:number1)
            if (each <100)
                number2.add(each);

        number1=number2;
        System.out.println(number1);
    }
}
