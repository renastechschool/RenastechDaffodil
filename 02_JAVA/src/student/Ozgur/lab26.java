package student.Ozgur;

import java.util.ArrayList;
import java.util.Arrays;

public class lab26 {
    //Write a method that can sort the ArrayList in descending order without using the sort method
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(2, 1, 9, 5));
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    Integer temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);

                }
            }
        }
        System.out.println(numbers);
    }
}
