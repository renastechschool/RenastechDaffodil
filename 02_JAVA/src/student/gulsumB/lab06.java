package student.gulsumB;
//(Array) Find Minimum
//Write a method that can find the maximum number from an int Array
public class lab06 {
    public static void main(String[] args) {

        int [] numbers={-25,-60,140,65,32,150};
        System.out.println(minNumber(numbers));

    }
    public static int minNumber(int[] numbersArray) {


        int miniNumber = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++) {
            if ( numbersArray[i] < miniNumber) {  miniNumber = numbersArray[i];}}
        return miniNumber;}

}


