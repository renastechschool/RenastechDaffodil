package student.Maksut;
public class  lab02 {
    public static boolean compareLetters(String firstS, String secondS) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        boolean result = false;
        if (firstS.length() != secondS.length()) {
            System.out.println("-Provided strings have different lengths.");
        } else {
            for (int i = 0; i < firstS.length() - 1; i++) {
                result = firstS.compareTo(secondS) <= 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compareLetters("abc", "cab"));
        System.out.println(compareLetters("abc", "abb"));
        System.out.println(compareLetters("abc", "abbc"));
        System.out.println(compareLetters("abc", "abcd"));
    }
}
