package student.gulsumB;
//(Array) Find Maximum
//Write a method that can find the maximum number from an int Array
public class lab05 {
    public static void main(String[] args) {

        int [] numbers={64,150,-35,75,120,210};
        System.out.println(maxNumber(numbers));

    }
    public static int maxNumber(int[] numbersArray) {


        int maxiNumber = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > maxiNumber) {  maxiNumber = numbersArray[i];}}
        return maxiNumber;}
}


