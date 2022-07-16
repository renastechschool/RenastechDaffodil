package student.LibbyAtar;

import java.util.ArrayList;
import java.util.Arrays;

public class lab23 {
    public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>();
    names.addAll(Arrays.asList("Amed", "Eric", "John", "Eric", "Amed" , "Eric"));
    System.out.println(names);
    System.out.println("removeArray = " + removeArray(names));
}
    public static ArrayList<String> removeArray(ArrayList<String> a ){
        ArrayList<String> removed = new ArrayList<>();
        for (int i = 0; i <= a.size()-1; i++){
            if (!a.get(i).equalsIgnoreCase("eric")){
                removed.add(a.get(i));
            }
        }
        return removed;
    }}

