package student.Yousef;

public class lab13 {
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    public static void main(String[] args) {
        System.out.println(frequencyOjCh("CCCDDEEE"));

    }


    public static String frequencyOjCh(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            result += str.charAt(i) + "" + count;
            str = str.replace("" + str.charAt(i), "");


        }


        return result;
    }
}