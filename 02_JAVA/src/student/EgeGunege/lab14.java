package student.EgeGunege;

public class lab14 {
    public static void main(String[] args) {

    }
    public static int sumDigitInString(String word){
        char[] array = word.toCharArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                int a = Integer.parseInt(String.valueOf(array[i]));
                sum = sum + a;
            }
        }
        return sum;
    }
}
