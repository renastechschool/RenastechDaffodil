package student.Maksut;
import java.util.ArrayList;
import java.util.Collections;
public class lab07 {//Write a return method that can concat two arrays
    public static ArrayList<String> concatTwoArray(String[] arr, String[] arr2) {
        ArrayList<String> result=new ArrayList<>();
        Collections.addAll(result, arr);
        Collections.addAll(result, arr2);
        return result;
    }
    public static void main(String[] args) {
        String[] arr = {"10, 9, 8, 7","backlog","¬"};String[] arr2 = {"triple","▒"};
        System.out.println(concatTwoArray(arr,arr2));
        System.out.println(concatTwoArray(arr2,arr));
    }
}
