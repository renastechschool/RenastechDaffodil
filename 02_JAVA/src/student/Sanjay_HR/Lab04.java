package student.Sanjay_HR;

public class lab04 {
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {
        uniqueCharacters("AAABBBCCCDEF");
    }
    public static String uniqueCharacters(String str) {
        String result = "";
        System.out.println("String = "+str);
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result += str.charAt(i);
            }
        }
        System.out.println("Uniques = "+result);
        return result;
    }
}
