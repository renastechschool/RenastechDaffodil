package student.gule;

import java.util.ArrayList;
import java.util.Arrays;

//Lab 07 -  //(Array) Concat two arrays
//Write a return method that can concate two arrays
public class lab07 {
    public static void main(String[] args) {

        ArrayList<String> nameList1 = new ArrayList<>();
        nameList1.addAll(Arrays.asList("Java brings","out the","worst","in me "));
        System.out.println(nameList1);
        ArrayList<String> nameList2 = new ArrayList<>();
        nameList2.addAll(Arrays.asList("I wish","it","didn't..."));
        System.out.println(nameList2);
        nameList1.addAll(nameList2);
        System.out.println("Famous Quote : " +nameList1);
    }
}
