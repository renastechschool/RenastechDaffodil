package student.Ozgur;

import java.util.Arrays;

public class lab02 {
    public static void main(String[] args) {

        System.out.println(check("abc", "bca"));
        System.out.println(check("aac", "abc"));
    }
   // (String) Same Letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex: same("abc", "cab"); -> true
//same("abc", "abb"); -> false:

    public static boolean check(String a,String b) {

        boolean result=false;

       char [] a1=a.toCharArray();
       char[]  b1=b.toCharArray();

       Arrays.sort(a1);
       Arrays.sort(b1);

       result=Arrays.equals(a1,b1);

return result;

        }

    }




