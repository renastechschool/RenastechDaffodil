package student.sezar;

public class lab5 {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int[] elements = {25,99,75,90,220,15};
        System.out.println(maximumnumber(elements));
    }
    public static int maximumnumber(int[] numberArray) {

        int maxNumber = numberArray[0];

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > maxNumber) { maxNumber = numberArray[i];}}
        return maxNumber;
    }
}
