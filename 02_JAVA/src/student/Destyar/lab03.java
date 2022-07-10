package student.Destyar;

import java.util.Arrays;

public class lab03 {
    //(String) Remove Duplicates
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {

        String word="AAABBBCCC";

        char str[] =word.toCharArray();

        int len=str.length;
        int index=0;
        for (int i = 0; i < len ; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == i) {
                str[index++] =str[i];

            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str,index)));

        }
    }

