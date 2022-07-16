package student.LibbyAtar;

import java.util.ArrayList;
import java.util.Arrays;

public class lab07 {
    public static void main(String[] args) {
        //Write a return method that can concate two arrays

        String[] mammals = {"cat", "dog", "raccoon", "hamster"};
        String[] birds = {"falcon", "hawk", "parrot", "eagle"};
        System.out.println("Combine 2 Arrays" + concate(mammals, birds));
        System.out.println("Yay it worked!");
    }
    public static ArrayList<String>concate(String[] mammals,String[]birds){
ArrayList<String>newArray=new ArrayList<String>();
        for (int b = 0; b <mammals.length ; b++) {

            newArray.add(mammals[b]);
        }

            for (int i = 0; i <birds.length ; i++)
            {
                newArray.add(birds[i]);
            }

return newArray;
}}
