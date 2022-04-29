package student.Inci;

public class lab05 {
    //Write a method that can find the maximum number from an int Array

//    public static void main(String[] args) {
//     int []number={5,8,7,2,9,55};
//  maximum(number);



    //public static void maximum (int[] number){
    public static void main(String[] args) {
        int[]number={5,87,63,6,2};
        maximum(number);
    }

    public static void maximum(int[]number){
        int temp = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > temp) {
                temp = number[i];

            }
        }
        System.out.println(temp);
    }

    }



