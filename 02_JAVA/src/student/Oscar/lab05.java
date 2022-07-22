package student.Oscar;

public class lab05 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 67, 99, 101, -27};
        System.out.println(findMax(numbers));

    }

    public static int findMax(int[] numbersArray) {
        int maxNumber = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > maxNumber) {
                maxNumber = numbersArray[i];
            }

        }return maxNumber;
    }
}
