package student.mustafa;

public class lab001 {
    public static void main(String[] args) {
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA

         String name="ABCD";
       int lastindexofName=name.length()-1;
       String reverseword="";
        for (int i = lastindexofName; i >=0 ; i--) {
            reverseword+=name.charAt(i);
            System.out.println(reverseword);
        }
        System.out.println("******************");
        System.out.println(reverseword);
    }
}
