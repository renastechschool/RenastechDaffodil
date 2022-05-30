package student.Ulzana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab23 {
    public static void main(String[] args) {

        List<String> names= new ArrayList<>(Arrays.asList("Amed",  "Eric","John", "Eric", "Amed" , "Eric"));

        System.out.println(names);

        names.removeAll(Arrays.asList("Eric"));
        System.out.println(names);

    }
}
