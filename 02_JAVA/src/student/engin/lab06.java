package student.engin;

import java.util.ArrayList;
import java.util.Arrays;

public class lab06 {
//Write a method that can find the maximum number from an int Array
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.addAll(Arrays.asList(0,4,5,6,-4,30,7,-1));
    System.out.println(min(list));
    
}

public static int min(ArrayList<Integer> arrList){
int min=arrList.get(0);
for (int i = 0; i < arrList.size(); i++) {
    if (arrList.get(i)<min) {
        min=arrList.get(i);
    }
}
    return min;
}

}
