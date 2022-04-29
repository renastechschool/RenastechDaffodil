package student.Inci;

import java.util.Arrays;

public class lab03 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC

   // public static void main(String[] args) {
//        String src = "AAABBBCCC";
//        System.out.println(duplicated("AAABBBCCC")+src.substring());


    //public static String duplicated(String src) {
    public static void main(String[] args) {


//        char []a=src.toCharArray();
//        System.out.println(Arrays.toString(a));

        String input = "AAABBBCCC";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int count=0;
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {

                    count--;
                }
            }
            if(count!=1){
                char x=input.charAt(i);
                output+=x;



                }
            }

        System.out.println(output);
    }
}




