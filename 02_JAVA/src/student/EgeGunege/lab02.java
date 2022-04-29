package student.EgeGunege;

import java.util.Arrays;

public class lab02 {
    public static String same(String w1, String w2){
        char[] ca1=w1.toCharArray();
        char[] ca2=w2.toCharArray();
        Arrays.sort(ca1);
        Arrays.sort(ca2);
        boolean b1=Arrays.equals(ca1,ca2);
        String result=(b1)?"Letters are equal.":"Letters are not equal";
        return result;
    }
    public static void main(String[] args) {
        String t1="abc";
        String t2="cab";
        String t3="abb";
        System.out.println(same(t1, t2));
        System.out.println(same(t1, t3));
    }
}
