package student.Gulistan;

import java.util.Arrays;

public class lab04 {
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCDEF") ==> "DEF";
    public static void main(String[] args) {
        System.out.printf(unique("AAABBBCDEF"));
    }

    private static String unique(String string){
        boolean flag    = true;
        char[] myChar   = string.toCharArray();
        Arrays.sort(myChar);

        String result   ="";
        for (int i = 0; i < myChar.length-1; i++) {
            if (myChar[i] != myChar[i+1] )
            {
                if (flag)
                    result += myChar[i];
                else flag = true;

            }else flag = false;
        }
        //we need to check the last index as well
        if (myChar[myChar.length-2] != myChar[myChar.length-1])
            result += myChar[myChar.length-1];
        return result;
    }
}
