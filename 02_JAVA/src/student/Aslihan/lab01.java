package student.Aslihan;

public class lab01 {
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
        reverseMethod("ABCD");
        reverseMethod("ilsA");
    }
    public static String reverseMethod(String str){
        String reverse="";
        for (int i=str.length()-1 ; i>=0 ; i--){
            reverse+=str.charAt(i);
        }
        System.out.println("reverse = " + reverse);
        return reverse;
    }

}
