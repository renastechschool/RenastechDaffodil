package student.Maksut;
import java.util.ArrayList;
public class lab17 {//Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    //Ex:
    //input:  {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]
    public static void main(String[] args) {
        int[] x = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] y={1,0,0,0,2,0,0,9,11,0,99};
        removeZero(x);
        removeZero(y);
    }

    public static void removeZero(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int j : arr) {
            if (j != 0) {
                result.add(j);
            }
        }
        for (int i : arr) {
            if (i == 0) {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
