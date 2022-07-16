package student.LibbyAtar;

import java.util.ArrayList;
import java.util.Arrays;

public class lab03 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC
    public static void main(String[] args) {

        ArrayList<String> removeDup=new ArrayList<>();
         removeDup.addAll(Arrays.asList("A","A","A","B","B","B","C","C","C"));
        System.out.println("Before  : " +  removeDup);
removeDup.remove(0);
removeDup.remove(1);
removeDup.remove(3);
removeDup.remove(4);
removeDup.remove(2);
removeDup.remove(3);
        System.out.println("After :  " +removeDup);


    }


}
