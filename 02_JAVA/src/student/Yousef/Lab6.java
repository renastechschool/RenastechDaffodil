package student.Yousef;

public class Lab6 {
    public static void main(String[] args) {
        //Write a method that can find the maximum number from an int Array


        int[] number = {45, 34, 654, 67, 32, 8};

        int max = 0;

        for (int i = 0; i < number.length; i++) {

            if (number[i] > max) {
                max = number[i];


            }
        }
        System.out.println("The max number is :" + max);
    }
}