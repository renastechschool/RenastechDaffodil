package student.Gulistan;

import java.util.Arrays;

//Write a method that can find the maximum number from an int Array
public class lab05 {
    public static void main(String[] args) {
        int [] intArray = {1,123,13,56,1024,234,-13,-12,0};
        System.out.println(maxInt(intArray));
    }

    private static int maxInt(int [] myArary){
        Arrays.sort(myArary);
        return myArary[myArary.length -1];
    }

}

