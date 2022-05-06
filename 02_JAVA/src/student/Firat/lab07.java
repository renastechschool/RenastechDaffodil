package student.Firat;

import java.util.ArrayList;
import java.util.Arrays;

public class lab07 {
    //Write a return method that can concate two arrays
    public static void main(String[] args) {
        ArrayList <Integer> one = new ArrayList<>();
        ArrayList <Integer> two = new ArrayList<>();
        one.addAll(Arrays.asList(1,2,3,4,5,6,7));
        two.addAll(Arrays.asList(11,22,33,44,55,66,77));
        System.out.println(concate(one,two));


    }

    public static ArrayList concate(ArrayList one, ArrayList two){
        ArrayList <Integer> concated = new ArrayList<>();

        concated.addAll(one);
        concated.addAll(two);

        return concated;
    }






}
