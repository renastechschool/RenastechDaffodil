package student.Ozgur;

public class lab03 {
    public static void main(String[] args) {

        //Write a return method that can remove the duplicated values from String
        //Ex: removeDup("AAABBBCCC") ==> ABC

        System.out.println(removeDup("AAABBBCCC"));

    }

    public static String removeDup(String word) {

        String result = "";
            for (int j = 0; j < word.length(); j++) {

                for (int i = 0; i < word.length(); i++) {
                    if (!(result.contains("" + word.charAt(i)))) {
                        result += word.charAt(i);
                    }
                }

            }return result;

    }}
