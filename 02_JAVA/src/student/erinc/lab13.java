package student.erinc;

public class lab13 {
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters

    public static void main(String[] args) {

        System.out.println(frequencyChar("AAABBBCDEEE"));

    }
    public static String frequencyChar ( String word ) {

        String result="";

        for (int i = 0; i < word.length(); i++) {
            int count1=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j))   {
                    count1++;
                }
            }

            if (! (result.contains(""+word.charAt(i)))) {
                result +=word.charAt(i)+" - "+ count1+" ";
            }
        }

        return  result;
    }
}
