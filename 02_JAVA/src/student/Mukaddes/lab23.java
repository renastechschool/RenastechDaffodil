package student.Mukaddes;

import java.util.ArrayList;
import java.util.Arrays;

public class lab23 {
    //Given a list of people' names: "Amed",  "Eric""John", "Eric", "Amed" , "Eric" .
   // Write a java operation to remove all the names named , "Eric"
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Amed",  "Eric","John", "Eric", "Amed" , "Eric"));
        System.out.println("names: "+names);
        names.removeAll(Arrays.asList("Eric"));
        System.out.println(names);
    }
}
