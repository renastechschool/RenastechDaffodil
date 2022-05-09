package student.engin;

import java.util.ArrayList;

public class lab15 {
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    //sort the individual string and append them back together
    //Ex:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"
    public static void main(String[] args) {

        String str = "DC501GCCCA098911";
        String[] sub=new String[str.length()];

        System.out.println(str.replaceAll("[0-9]",""));

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) > 48 && str.charAt(i) < 58 ) {
//                str.replaceAll("[9-9]","");
//            }else str.
//
//            }



    }
}

