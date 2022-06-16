package student.Yousef;

public class Lab4 {
    public static void main(String[] args) {
        //Write a return method that can find the unique characters from the String
        //Ex: unique("AAABBBCCCDEF") ==> "DEF";

        String letters = "AAABBBCCCDEF";
        String result = "";

        for (int i = 0; i < letters.length(); i++) {

            int count = 0;

            for (int j = 0; j < letters.length(); j++) {

                if(letters.charAt(i)==letters.charAt(j)){

                count++;
            }
        }
        if (count == 1) {
            result += letters.charAt(i);
        }
    }
            System.out.println(result);

        }

    }
