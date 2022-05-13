package student.suleyman;

import java.util.ArrayList;
import java.util.HashSet;

public class lab13 {

    public static void main(String[] args)
    {
        calFrequency("gozlerimgozlerinigozlerkengozleriningozlerimigozlediginigozledim");

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
