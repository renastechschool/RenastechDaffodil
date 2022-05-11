package student.Ali_Can_Pazarcikli;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class lab03 {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));

    }
    public static String removeDuplicates(String word){
        String result="";
        for (int i = 0; i < word.length(); i++) {
            if( ! (result.contains(""+word.charAt(i)))){
                result +=word.charAt(i);
            }
        }
        return result;
    }
}
