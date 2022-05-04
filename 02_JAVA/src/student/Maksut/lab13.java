package student.Maksut;
public class lab13 {//String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    public static String frequencyOfChars(String str) {
        String result2 = "";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!(result.toString().contains("" + str.charAt(i)))) {
                result.append(str.charAt(i));
            }
        }

        for (int i = 0; i < result.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (result.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(result.charAt(i) + " is " + count);
        }
        return result2;
    }

    public static void main(String[] args) {
        String given = "aaaabbb22222!!AA♥";
        System.out.println(frequencyOfChars(given));
    }
}
