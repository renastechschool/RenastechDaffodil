package Buket;

import java.util.Scanner;

public class lab13 {

    //## Lab 13 -  //(String) Frequency of Characters
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters

    public static void main(String[] args) {

    }

    public void findCharacterFrequency(String s) {

        int[] freq = new int[s.length()];
        int i, j;

        //Converts given string into character array
        char string[] = s.toCharArray();

        for (i = 0; i < s.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < s.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }
        for (i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
    {


        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Please enter string to find frequency of characters: ");
        s = sc.nextLine();
        findCharacterFrequency(s);
    }
}


