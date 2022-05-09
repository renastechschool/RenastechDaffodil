package student.sezar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab15 {
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    //sort the individual string and append them back together
    //Ex:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"
    public static void main(String[] args)
    {
        orderAlphaNumeric("DC501GCCCA098911");
    }
    public static void orderAlphaNumeric(String a)
    {
        String sample = "taylan 1994";
        List<String> arr = new ArrayList<String>
        (Arrays.asList(sample.split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))")));
        System.out.println("arr = " + arr);
    }
}
