package student.suleyman;

public class lab05 {

    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {

        int [] num={150,6,-40,784,-90,9541,623,6,-41,85520};
        System.out.println(FindMaNumber(num));
    }

    public static int FindMaNumber(int [] numbers){
        int MaxNumber=numbers[0];

        for (int i = 1; i <numbers.length ; i++) {
            if (numbers[i] > MaxNumber){
                MaxNumber=numbers[i];
            }

        }
        return MaxNumber;
    }
}
