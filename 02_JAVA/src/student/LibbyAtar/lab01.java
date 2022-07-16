package student.LibbyAtar;

public class lab01 {
    public static void main(String[] args) {
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA

        String reverse = "ABCD";
        String r = " ";
        for (int i = reverse.length() - 1; i >= 0; i--) {

            r += reverse.charAt(i);
        }
        System.out.println("This reversed  " +reverse+ "  will equal to " +r);}


}