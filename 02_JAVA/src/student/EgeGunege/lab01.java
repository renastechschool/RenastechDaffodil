package student.EgeGunege;

public class lab01 {
    public static String reverse(String s){
        int l=s.length()-1;
        String reverse="";
        for (int i=l;i>=0;i--){
            reverse+=s.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));

    }
}
