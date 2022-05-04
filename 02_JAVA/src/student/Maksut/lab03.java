package student.Maksut;
public class lab03 {
    public static String removeDuplicate(String a) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {

            if ( ! ( result.toString().contains("" + a.charAt(i)) )) {
                result.append(a.charAt(i));}}
        return result.toString();
        }
    public static void main(String[] args) {
        String str="AAABBBCCC";
        System.out.println(removeDuplicate(str));
    }
}
