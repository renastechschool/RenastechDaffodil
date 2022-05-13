package student.EgeGunege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab15 {
    public static void main(String[] args) {
     String str="DC501GCCCA098911";
     ArrayList<String> part = new ArrayList<>();
     ArrayList<ArrayList<Character>> array=new ArrayList<>();
     String result="";
     part.addAll(Arrays.asList(str.split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))")));
        for (String each:part) {
            ArrayList<Character> list=new ArrayList<>();
            for (int i = 0; i < each.length(); i++) {
                list.add(each.charAt(i));
            }
            Collections.sort(list);
            array.add(list);
        }
        for (ArrayList each:array) {
            for (int j = 0; j < each.size(); j++) {
                result+=each.get(j);
            }
        }

        System.out.println(result);
    }
}
