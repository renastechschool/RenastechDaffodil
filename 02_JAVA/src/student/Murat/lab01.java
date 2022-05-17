package Murat;

public class lab01 {
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {

        String str="ABCD";
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));

        }

    }
}
