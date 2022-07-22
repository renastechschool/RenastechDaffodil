package student.Bunyamin;

public class lab_01 {
    public static void main(String[] args) {
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA

        String word = "ABCD";
        System.out.println(reverse(word));
    }

    public static String reverse(String word){
        String reverse = "";
        for (int i = word.length()-1; i >= 0 ; i--) {

            reverse +=word.charAt(i);
        }


        return  reverse;
    }
}
