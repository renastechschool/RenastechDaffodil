package student.Hatice;

public class lab1 {
    public static void main(String[] args) {
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA
        System.out.println(reverseString("ABCD"));

    }

    public static String reverseString(String word){


        String result="";
        for (int i = word.length()-1;   i >=0;   i--) {
            result += word.charAt(i);}

        return result;
    }

}
