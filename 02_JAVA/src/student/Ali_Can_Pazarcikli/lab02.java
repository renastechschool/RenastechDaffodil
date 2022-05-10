package student.Ali_Can_Pazarcikli;

import java.util.Arrays;

public class lab02 {
    public static void main(String[] args) {
        System.out.println(compare("abc","dba"));
        System.out.println(compare("123","213"));

    }

    public  static String compare(String a,String b){
        char [] str1=a.toCharArray();
        char [] str2=b.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        boolean str3=Arrays.equals(str1,str2);
        return String.valueOf(str3);

    }
}
