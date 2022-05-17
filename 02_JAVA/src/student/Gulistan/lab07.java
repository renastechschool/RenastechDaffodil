//Write a return method that can concat two arrays
package student.Gulistan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class lab07 {

    private static String[] concatenate (String[] first, String[] second){

        List<String> both = new ArrayList<String>(first.length + second.length);
        Collections.addAll(both, first);
        Collections.addAll(both, second);
        return both.toArray(new String[both.size()]);
    }

    public static void main(String[] args) {
        String[] A = {"K","u","r","d"," "};
        String[] B = {"K","u","r","d","i"};
        System.out.printf(Arrays.toString(concatenate(A,B)));
    }
}
