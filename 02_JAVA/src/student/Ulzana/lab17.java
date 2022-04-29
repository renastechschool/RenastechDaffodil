package student.Ulzana;

import java.util.Arrays;

public class lab17 {

    public static void main(String[] args) {

        int[] numbersArray = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(zeroAtEnd(numbersArray)));
    }


    //Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    //input:  {1,0,2,0,3,0,4,0};    //output: [1, 2, 3, 4, 0, 0, 0, 0]

  public static int [] zeroAtEnd(int [] numbers ){

    int[] newNumbers = new int[numbers.length];
    int index=0;
    int len = newNumbers.length-1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                  newNumbers[index] = numbers[i];  index++;  }
            else { newNumbers[len] = numbers[i];   len--;  } }

        return newNumbers;  }


}
