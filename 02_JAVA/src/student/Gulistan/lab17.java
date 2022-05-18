package student.Gulistan;

import java.util.Arrays;

//Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
//Ex:
//input:  {1,0,2,0,3,0,4,0};
//output: [1, 2, 3, 4, 0, 0, 0, 0]
public class lab17 {

    private static void moveZero(int [] intArray){
        for (int i = 0; i < intArray.length ; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i] == 0 && intArray[j] !=0){
                    intArray[i] = intArray[j];
                    intArray[j] = 0;
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void main(String[] args) {
        int[] intArray = {1,0,2,0,3,5,4,0};
        moveZero(intArray);
    }
}
