package student.sezar;

import java.util.ArrayList;

public class lab7 {
    //Write a return method that can concate two arrays
    public static void main(String[] args) {
        String [] elements1  = {"B", "A", "D"};
        String [] elements2  = {"B", "O", "Y",};

        int length =elements1.length+elements2.length;

        ArrayList<String> arrayList =new ArrayList<>(length);

        for (int i = 0; i <elements1.length; i++) { arrayList.add(elements1[i]);}
        for (int i = 0; i <elements1.length; i++) { arrayList.add(elements2[i]);}
        System.out.println(arrayList);
    }
}
