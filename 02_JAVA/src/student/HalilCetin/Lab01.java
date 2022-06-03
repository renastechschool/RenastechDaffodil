package student.HalilCetin;

public class Lab01 {
    public static void main(String[] args) {
        ReverseString("Halil");
    }
    public static void ReverseString(String word) {
        String finalWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            finalWord+=word.charAt(i);
        }
        System.out.println(finalWord);
    }
}
