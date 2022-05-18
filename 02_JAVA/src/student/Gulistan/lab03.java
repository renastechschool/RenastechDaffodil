package student.Gulistan;

import java.util.Arrays;

public class lab03 {
    //Write a return method that can remove the duplicated values from String
    //Ex: r emoveDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {
        System.out.println(removeDup("aabbbbccbbaa"));
    }

    private static String removeDup(String string){
        char [] myChar      = string.toCharArray();
        Arrays.sort(myChar);
        char firstChar      = myChar[0];
        String plainString  = Character.toString(firstChar);

        for (int i = 1; i < myChar.length; i++) {
            if (firstChar != myChar[i]){

                plainString += myChar[i];
                firstChar    = myChar[i];
            }
        }
        return plainString;
    }
}