package student.HaticeKarakoyun;

import java.util.Arrays;

public class lab06 {

    //Write a method that can find the min number from an int Array

    public static void main(String[] args) {

        int [] numberList = {12,25,0,-20,-1,37,56,-75};

        System.out.println(Arrays.toString(numberList));


        System.out.println("Minimum number is = " + minimumNumber(numberList));
    }

    public static int minimumNumber(int[] numbersArray) {

        int minNumber = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] < minNumber) {
                minNumber = numbersArray[i];
            }
        }
        return minNumber;}
    }



