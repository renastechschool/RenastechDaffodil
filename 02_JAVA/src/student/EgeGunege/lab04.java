package student.EgeGunege;

import java.util.ArrayList;
import java.util.HashSet;

public class lab04 {
    public static void unique(String w) {
        String result="";
        char[] arr=w.toCharArray();
        HashSet<Character> set1=new HashSet<Character>();
        HashSet<Character> set2=new HashSet<Character>();
        for(char i:arr)
        {
            if(set1.contains(i))
            {
                set1.add(i);
                set2.remove(i);
            }
            else
            {
                set1.add(i);
                set2.add(i);
            }
        }
        for (Character j:set2
             ) {
            result+=j;
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        unique("AAABBBCCCDEF");
    }
}
