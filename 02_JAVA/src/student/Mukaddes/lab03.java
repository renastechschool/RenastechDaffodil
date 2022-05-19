package student.Mukaddes;

public class lab03 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC
    public static String unique(String s) {
        String str = new String();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (str.indexOf(c) < 0) {
                str += c;
            }


        }
        return str;
    }


    public static void main(String[] args) {
        String s = "AAABBBCCC";
        System.out.println(unique(s));
    }



}
