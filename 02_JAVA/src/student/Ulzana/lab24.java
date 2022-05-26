package student.Ulzana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lab24 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>((Arrays.asList(1, 4, 98, 465, 99, 244, 0, -345)));

        LinkedList<Integer> newNumbers = new LinkedList<>();


        for (Integer each : numbers) {
            if (each <= 100) { newNumbers.add(each);    }}
        System.out.println("All values smaller than 100: "+ newNumbers);

    }
}

