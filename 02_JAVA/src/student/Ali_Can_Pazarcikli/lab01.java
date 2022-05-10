package student.Ali_Can_Pazarcikli;

public class lab01 {
    public static void main(String[] args) {
        System.out.println("ABCD");
        System.out.println("JAVA");
    }
    public static String reverse(String str){
        int lastIndex=str.length()-1;
        String reverse="";
        for (int i = lastIndex; i >=0 ; i--) {
            reverse +=str.charAt(i);
        }
        return  reverse;
    }
}
