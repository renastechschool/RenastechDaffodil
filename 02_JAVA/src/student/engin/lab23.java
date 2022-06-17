package student.engin;

import java.util.ArrayList;
import java.util.Arrays;

public class lab23 {
   // Given a list of people' names: "Amed",  "Eric", "John", "Eric", "Amed" , "Eric" .
   // Write a java operation to remove all the names named , "Eric"

    public static void main(String[] args) {

        String[] nameList= {"Amed",  "Eric", "John", "Eric", "Amed" , "Eric"};
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList(nameList));

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase("eric")){
                names.remove(names.get(i));
            }
        }
        System.out.println("names = " + names);
    }

}
