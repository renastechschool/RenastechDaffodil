package student.Ulzana;

import java.util.Arrays;

public class lab15 {

    public static void main(String[] args) {

        String name = "DC501GCCCA098911";
        SortLettersAndNumbersFromString(name);

    }
    public static void SortLettersAndNumbersFromString(String givenString) {

        String newString = "";

        for(int i = 0; i < givenString.length(); i++) {
            newString += ""+ givenString.charAt(i);
            if(Character.isAlphabetic(givenString.charAt(i)) && i < givenString.length()-1 ) {
                if(Character.isDigit(givenString.charAt(i+1)) ) {
                    newString +=",";    }}

            if(Character.isDigit(givenString.charAt(i)) && i < givenString.length()-1) {
                if(Character.isAlphabetic(givenString.charAt(i+1))) {
                    newString +=",";  }}
        }

        String[] arrayString = newString.split(",");
        givenString ="";
        for(String each: arrayString) {
            char[] chars=each.toCharArray();
            Arrays.sort(chars);
            for(char eachChar: chars){
                givenString +=""+eachChar;    }}
        System.out.println(givenString);     }

}
