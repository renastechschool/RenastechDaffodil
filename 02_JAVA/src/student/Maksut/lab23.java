package student.Maksut;
import java.util.ArrayList;
import java.util.Arrays;
public class lab23 {
    /*
    (ArrayList) Remove "Eric"
            Given a list of people' names: "Ahmed",  "Eric","John", "Eric", "Ahmed" , "Eric" .
            Write a java operation to remove all the names named , "Eric"
     */
    public static void main(String[] args) {
        ArrayList<String> givenArrList = new ArrayList<>(Arrays.asList("Ahmed", "Eric", "John", "Eric", "Ahmed", "Eric"));
        removeEric(givenArrList);
    }
    static void removeEric(ArrayList<String> givenL){
        for (int i = 0; i < givenL.size(); i++) {
            if (givenL.get(i).equalsIgnoreCase("eric")){
                givenL.remove(givenL.get(i));}
        }
        System.out.println(givenL);
    }
}
