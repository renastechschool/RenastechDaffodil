package student.suleyman;

public class lab01 {

    public static void main(String[] args) {


        System.out.println(reverseMethod("Suleyman"));
        System.out.println(reverseMethod("Virginia"));

    }

    public static String reverseMethod(String word){
        String result="";

        for (int i=word.length()-1; i>=0 ; i--){
            result+=word.charAt(i);
        }
        return result;
    }
}
