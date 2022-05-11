package student.sezar;

public class lab6 {
    //Write a method that can find the minimum number from an int Array
    public static void main(String[] args) {
        int[] elements = {64, 84,352, 48};
        System.out.println(minimumNumber(elements));

    }

    public static int minimumNumber(int[] numberArray) {

        int minNumber = numberArray[0];

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] < minNumber) { minNumber = numberArray[i];}}
        return minNumber;
    }
}
