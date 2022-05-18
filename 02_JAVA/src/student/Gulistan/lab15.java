package student.Gulistan;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
//sort the individual string and append them back together
//Ex:
//Input:  "DC501GCCCA098911"
//OutPut: "CD015ACCCG011899"
public class lab15 {
  public static void main(String[] args) {

    Pattern p = Pattern.compile("[a-z]+|\\d+");
    Matcher m = p.matcher("123abc345def");
    ArrayList<String> allMatches = new ArrayList<>();
        while (m.find()) {
        allMatches.add(m.group());
        }
      System.out.println(allMatches);
  }
}


