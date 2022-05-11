package student.Ali_Can_Pazarcikli;

import java.util.Locale;

public class lab04 {
    public static void main(String[] args) {
        System.out.println(unique("ADDDFFFLEEDDI"));

    }
    public static String unique(String word){
        String result="";
        for (int i = 0; i <word.length(); i++) {
            int count=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count ++;
                }
            }
            if (count==1){
                result +=word.charAt(i);
            }
        }
        return result;
    }
}
