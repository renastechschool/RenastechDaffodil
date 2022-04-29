package student.TaylanTonka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class lab13 {
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    public static void main(String[] args) {

        calFrequency("labaratuvardakimikroskop");
    }



    public static void calFrequency(String a)
    {

        ArrayList<Character> chars = new ArrayList<Character>();

        for(int i=0;i<a.length();i++)
        {
            chars.add(a.charAt(i));
        }
        HashSet<Character> unique = new HashSet<>(chars);


        ArrayList<Character> uniquaLast = new ArrayList<>(unique);
        for(int i=0;i<uniquaLast.size();i++)
        {
            char temp = uniquaLast.get(i);
            int count = 0;
            for(int z=0;z<chars.size();z++)
            {
                if(temp==chars.get(z))
                {
                    count++;
                }
            }
            System.out.println("Character of "+uniquaLast.get(i) +" is existing =" + count);
        }


    }

}
