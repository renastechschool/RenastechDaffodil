package student.Ulzana;

public class lab05 {

    public static void main(String[] args) {

        int [] numbers={56,78,-9,0,23,85,99};
        System.out.println(maximumNumber(numbers));

    }


    public static int maximumNumber(int[] numbersArray) {
        //(Array) Find Maximum
        //Write a method that can find the maximum number from an int Array

        int maxNumber = numbersArray[0];
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] > maxNumber) {  maxNumber = numbersArray[i];}}
        return maxNumber;}
}
