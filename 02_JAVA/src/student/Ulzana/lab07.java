package student.Ulzana;

import java.util.Arrays;

public class lab07 {

    public static void main(String[] args) {
        String [] first={"Ul", "KZ", "CA"};
        String [] second={"USA", "KZ", "AZ"};

        System.out.println(Arrays.toString(concatTwoString(first,second)));

    }

    public static String [] concatTwoString(String [] first, String [] second) {

        //(Array) Concat two arrays
        //Write a return method that can concate two arrays

         String [] result= new String[ first.length + second.length];
         int index=0;

        for (int i = 0; i < first.length; i++) {
             result[index]=first[i];
             index++; }

        for (int i = 0;  i < second.length; i++) {
             result[index]=second[i];
             index ++; }

        return result;  }



}
