package student.HaticeKarakoyun;

import java.util.Arrays;

public class lab05 {

    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {

        int [] numberList = {12,25,0,-20,-1,37,56,-75};

        System.out.println(Arrays.toString(numberList));


        System.out.println("Maximum number is = " + maximumNumber(numberList));
    }

    public static int maximumNumber(int[] numbersArray) {

        int maxNumber = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > maxNumber) {
                maxNumber = numbersArray[i];
            }
        }
        return maxNumber;}
}

