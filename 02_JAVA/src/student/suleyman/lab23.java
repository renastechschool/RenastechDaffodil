package student.suleyman;

import java.util.ArrayList;
import java.util.Arrays;

public class lab23 {

   // Given a list of people' names: "Amed",  "Eric""John", "Eric", "Amed" , "Eric" .
    //Write a java operation to remove all the names named , "Eric"


    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amed",  "Eric","John", "Eric", "Amed" , "Eric"));

        names.removeAll( Arrays.asList("Eric"));

        System.out.println(names);
    }
}
