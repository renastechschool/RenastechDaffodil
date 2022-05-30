package student.gule;

public class lab_01 {
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static String reverse(String name) {

        StringBuilder name1 = new StringBuilder(); // object of the class- class name ,objectname = new, object of the class();
        name1.append(name);
        name1.reverse();
        return name1.toString();
    }
    public static String reverse1 (String stringToReverse){
        String reversedString = "";
        char ch;

        for(int i=stringToReverse.length(); i>0; i--){

            ch = stringToReverse.charAt(i-1);
            reversedString = reversedString+ch;
        }
        return reversedString;

    }

    public static void main(String[] args) {
        System.out.println(reverse("HCET SANER"));

        System.out.println(reverse1("❤ ELUG"));

    }
}
