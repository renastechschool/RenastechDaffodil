package student.Sanjay_HR;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab23 {
    //Given a list of people' names: "Amed",  "Eric""John", "Eric", "Amed" , "Eric" .
    //Write a java operation to remove all the names named , "Eric"
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Amed", "Eric", "John","Eric","Amed","Eric"));
        removeName(names,"Eric");
    }
    public static ArrayList removeName(ArrayList<String>nameList, String removeName){
        System.out.println("Name list = "+nameList);
        for (int i = 0; i < nameList.size(); i++) {
            if(nameList.contains(removeName)){
                nameList.removeAll(Arrays.asList(removeName));
            }
        }
        System.out.println("Name list ater \""+removeName+"\" is removed = "+nameList);
        return nameList;
    }
}
