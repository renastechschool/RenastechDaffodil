package student.Aslihan;

public class lab04 {
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        System.out.println(unique(str));
    }
    public static String unique(String str){
        String result="";
        for (int i=0 ; i<str.length() ; i++) {
            String current=""+str.charAt(i);
            if (str.split(current).length<=2){
                result+=current;
            }}
        return result;
    }
}
