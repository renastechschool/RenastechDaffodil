package student.Oscar;

public class lab01 {

    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void reverseString (String name){
        String reversedResult = "";

        for (int i = name.length()-1 ; i >= 0 ; i--){
            reversedResult += name.charAt(i);
        }
        System.out.println(reversedResult);
    }

    public static void main(String[] args) {
        reverseString("racso");
    }
}
