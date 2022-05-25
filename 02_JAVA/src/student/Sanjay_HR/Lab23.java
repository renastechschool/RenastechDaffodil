package student.Sanjay_HR;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab23 {
    //Given a list of people' names: "Amed",  "Eric""John", "Eric", "Amed" , "Eric" .
    //Write a java operation to remove all the names named , "Eric"
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Amed" ,"Eric", "John", "Eric", "Amed", "Eric"));
        duplicateNames(names,"Eric");
    }
    public static void duplicateNames(ArrayList<String> names, String removeName){
        int i=0;
        System.out.println("Names = "+names);
        while(i<names.size()){
            if(names.get(i).equals(removeName)){
                names.remove(i);
            }
            i++;
        }
        System.out.println("List after "+removeName+" is removed = "+names);
    }
}
