package student.erinc;

import java.util.ArrayList;
import java.util.Arrays;

public class lab23 {
    //Given a list of people' names: "Amed",  "Eric""John", "Eric", "Amed" , "Eric" .
   // Write a java operation to remove all the names named , "Eric"
    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("Amed","Eric","John","Eric","Amed","Eric"));

        list.removeAll(Arrays.asList("Eric"));
        System.out.println(list);






    }






}
