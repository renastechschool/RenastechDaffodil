package student.engin;

import java.util.ArrayList;
import java.util.Arrays;

public class lab24 {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {
        ArrayList<Integer> arrlIST1 = new ArrayList<>();
        arrlIST1.addAll(Arrays.asList(1, 200, 3, 5,7, 400, 5, 600));
        arr(arrlIST1);
    }

    public static void arr(ArrayList<Integer> arrlIST) {

        for (int i = 0; i < arrlIST.size(); i++) {
            if (arrlIST.get(i) > 100) {
                arrlIST.remove(arrlIST.get(i));
            }
        }
        System.out.println("arrlIST = " + arrlIST);
    }
}
