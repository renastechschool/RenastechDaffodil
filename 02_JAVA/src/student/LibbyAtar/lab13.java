package student.LibbyAtar;

public class lab13 {

    public static void main(String[] args) {
        System.out.println(frequency("you see, I see, we all see"));

    }

    public static String frequency(String word) {

        String result = " ";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }

            result += word.charAt(i) + " - " + count + "\n";

        }

        return result;
    }}


















