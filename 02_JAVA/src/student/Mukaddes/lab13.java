package student.Mukaddes;

import static java.lang.Integer.SIZE;

public class lab13 {

    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters

    public static class char_frequency {

        static void printCharWithFreq(String str) {
            int n = str.length();
            int[] frq = new int[SIZE];
            for (int i = 0; i < n; i++) {
                frq[str.charAt(i) - 'a']++;
            }
            for (int i = 0; i < n; i++) {
                if (frq[str.charAt(i) - 'a'] != 0) {
                    System.out.println(str.charAt(i));
                    System.out.println(frq[str.charAt(i) - 'a'] + " ");
                    frq[str.charAt(i) - 'a'] = 0;
                }
            }
        }

        public static void main(String[] args) {
            String str = "mukaddessahin";
            printCharWithFreq(str);
        }

    }
}

