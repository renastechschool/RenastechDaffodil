package student.Oscar;

import java.util.ArrayList;
import java.util.Arrays;

public class lab23 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Amed",  "Eric","John", "Eric", "Amed" , "Eric"));
        System.out.println(list);
        list.removeAll(Arrays.asList("Eric"));
        System.out.println(list);


    }


}
