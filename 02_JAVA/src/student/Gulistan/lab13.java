package student.Gulistan;

import java.util.Arrays;
import java.util.Objects;

//String -- Frequency of Characters
//Write a return method that can find the frequency of characters
public class lab13 {

    public static String[] frequency(String input) {
        String[] result = new String[input.length()];
        char[] chars    = input.toCharArray();
        int[] frequency = new int[input.length()];

        for (int i = 0; i < chars.length; i++) {
            frequency[i] = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        frequency[i]++;
                        chars[j]=' ';
                }
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] !=' '){
                result[i] = chars[i] +" " + frequency[i] +" ";
            }
        }
        // need to delete null elements from result
        //TODO
        return Arrays.stream(result).filter(Objects::nonNull).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequency("aaabbcdd")));
    }
}