package student.engin;

public class lab01 {
    public static void main(String[] args) {
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA

        String str="ABCD";
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));

        }
       

    }
}
