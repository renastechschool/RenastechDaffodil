package student.Ali_Can_Pazarcikli;

public class lab6 {
    public static int minNumber(int [] number){
        int min=number[0];
        for (int i = 0; i <number.length; i++) {
            if (number[i]<min){
                min=number[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr={23,56,89,-12,65,-600,765,2,6,90};
        System.out.println(minNumber(arr));
    }
}
