package student.Ali_Can_Pazarcikli;

public class lab5 {

    public static int maxNumber(int [] number){
        int max=number[0];
        for (int i = 0; i <number.length; i++) {
            if (number[i]>max){
                max=number[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr={23,56,89,-12,65,-600,765,2,6,90};
        System.out.println(maxNumber(arr));
    }
}
