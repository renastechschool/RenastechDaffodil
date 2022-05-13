package student.gulsumB;
//(String) Reverse
//Write a return method that can reverse  String
// Ex: Reverse("ABCD"); ==> DCBA
public class lab01 {
    public static void main(String[] args) {

        System.out.println(reverseString("Java"));

    }public static String reverseString(String word){
        String result="";
        for (int i = word.length()-1;   i >=0;   i--) {
            result += word.charAt(i);}

        return result;
    }
}

