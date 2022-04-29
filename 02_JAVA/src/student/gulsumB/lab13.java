package student.gulsumB;

import static java.lang.Long.SIZE;

//String -- Frequency of Characters
//Write a return method that can find the frequency of characters
public class lab13 {
    static void printCharWithFreq(String str)
    {
        // size of the string 'str'
        int n = str.length();
        int[] freq = new int[SIZE];

        for (int i = 0; i < n; i++)
            freq[str.charAt(i) - 'a']++;

        for (int i = 0; i < n; i++) {

            if (freq[str.charAt(i) - 'a'] != 0) {

                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " ");


                freq[str.charAt(i) - 'a'] = 0;
            }
        }
    }public static void main(String args[])
    {
        String str = "geeksforgeeks";
        printCharWithFreq(str);
    }
}

