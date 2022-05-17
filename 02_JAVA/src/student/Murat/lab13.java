package Murat;

public class lab13 {


    // String -- Frequency of Characters. Write a return method that can find the frequency of characters

    public static void main(String[] args) {

        System.out.println(frequency("they don't know we know they know"));

    }

    public static String frequency ( String word ) {

        String result1="";


        for (int i = 0; i < word.length(); i++) {
            int count1=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j))   {  count1++;   } }

            if (! (result1.contains(""+word.charAt(i))))
            { result1 +=word.charAt(i)+" - "+ count1+"\n";  }  }

        return  result1; }



}
