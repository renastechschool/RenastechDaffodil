package student.gule;

import java.util.ArrayList;
import java.util.Arrays;

public class lab15 {
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    //sort the individual string and append them back together
    //Ex:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"

    public static void main(String[] args) {
        orderAlphaNumeric("DC501GCCCA098911");
    }

    public static void orderAlphaNumeric(String a) {
        String regex = "((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))";

        ArrayList<String> subset = new ArrayList<>(Arrays.asList(a.split(regex)));
        System.out.println("subset = " + subset);

        for (int q = 0; q < subset.size(); q++) {
            String str = subset.get(q);



            char temp = 0;

            char [] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            subset.set(q, String.valueOf(arr));

        }
        System.out.println("subset = " + subset);
        String temp = "";
        for (int n = 0; n < subset.size(); n++) {
            temp += subset.get(n);
        }
        System.out.println("temp = " + temp);
    }
}

