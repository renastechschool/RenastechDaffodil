package student.Inci;

public class lab01 {
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {
        System.out.println("PEACE   :" +reverseString("PEACE"));

    }
    public static String reverseString(String word) {

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);

        }
        return result;
    }
}









