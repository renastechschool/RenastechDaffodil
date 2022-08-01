package student.Bunyamin;

public class lab_06 {
    public static void main(String[] args) {

        int [] numbers={56,78,-9,0,23,85,99};
        System.out.println(minimumNumber(numbers));

    }


    public static int minimumNumber(int[] numbersArray) {
        //(Array) Find Minimum
        //Write a method that can find the maximum number from an int Array

        int minNumber = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++) {
            if ( numbersArray[i] < minNumber) {  minNumber = numbersArray[i];}}
        return minNumber;}
}
