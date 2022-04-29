package student.EgeGunege;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class lab07 {
    public static ArrayList concatArray(ArrayList list1,ArrayList list2){
        ArrayList<Type> list3=new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        return list3;
    }

    public static void main(String[] args) {
        ArrayList list4=new ArrayList<>();
        ArrayList list5=new ArrayList<>();
        list4.addAll(Arrays.asList("Hello world"));
        list5.addAll(Arrays.asList("Java is fun"));
        ArrayList list6=new ArrayList<>();
        ArrayList list7=new ArrayList<>();
        list6.addAll(Arrays.asList(1,2,3,4,5));
        list7.addAll(Arrays.asList(6,7,8,9,0));
        System.out.println(concatArray(list4,list5));
        System.out.println(concatArray(list6,list7));
    }
}
