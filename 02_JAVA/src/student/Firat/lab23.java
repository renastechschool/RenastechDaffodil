package student.Firat;

import java.util.ArrayList;

//## Lab 23 - (ArrayList) Remove "Eric"
//        Given a list of people' names: "Amed",  "Eric""John", "Eric", "Amed" , "Eric" .
//        Write a java operation to remove all the names named , "Eric"
public class lab23 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Amed");
        list.add("\"Eric\"\"John\"");
        list.add("Eric");
        list.add("Amed");
        list.add("Eric");
        System.out.println(list); //  [Amed, "Eric""John", Eric, Amed, Eric]





        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equalsIgnoreCase("Eric")){
                list.remove(i);

            }

        }
        System.out.println(list);








    }


}
