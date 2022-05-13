package student.EgeGunege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab17 {
    public static void sortNumbers(ArrayList<Integer> list){
        int zeroCount=0;
        ArrayList<Integer> result=new ArrayList<>();
        for (int each:list) {
            if(each==0){
                zeroCount++;
                continue;
            }else{
                result.add(each);
            }
        }
        Collections.sort(result);
        for (int i = 0; i <= zeroCount; i++) {
            result.add(0);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        sortNumbers(numbers);
    }
}
