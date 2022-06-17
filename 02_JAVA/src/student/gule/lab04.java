package student.gule;
//Lab 04 -   //(String) Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";

public class lab04 {
    public static void main(String[] args) {
        String word = "AAABBBCCCDEF";
        System.out.println(unique("AAABBBCCCDEF"));
    }

    public static String unique(String word) {

        String str = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                str = str + word.charAt(i);
            }

        }

        return str;
    }
}

