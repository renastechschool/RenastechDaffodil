package student.Gulistan;

import java.util.Arrays;
//Write a method that can find the minimum number from an int Array

public class lab06 {
    public static void main(String[] args) {
        int [] intArray = {1,123,13,56,1024,234,-13,-12,0};
        System.out.println(minInt(intArray));
    }

    private static int minInt(int [] myArarry){
        Arrays.sort(myArarry);
        return myArarry[0];
    }
}
