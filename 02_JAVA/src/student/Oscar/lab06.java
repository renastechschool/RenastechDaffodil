package student.Oscar;

public class lab06 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 67, 99, 101, -27};
        System.out.println(findMin(numbers));

    }

    public static int findMin(int[] numbersArray) {
        int minNumber = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] < minNumber) {
                minNumber = numbersArray[i];
            }

        }return minNumber;
    }
}

