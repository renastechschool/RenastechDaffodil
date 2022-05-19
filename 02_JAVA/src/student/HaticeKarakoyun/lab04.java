package student.HaticeKarakoyun;

public class lab04 {

    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {

        String str1 = "AAABBBCCCDEF";
        String result = unique(str1);

        System.out.println("str1 is = " + str1);
        System.out.println("Unique string is = " + result);
    }

    public static String unique(String str1){
        String unique = "";
        for (int i = 0; i < str1.length(); i++) {
            int count = 0;

            for (int j = 0; j < str1.length(); j++) {
                String first = "" + str1.charAt(i);
                String second = "" + str1.charAt(j);

                if (first.equals(second)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += str1.charAt(i);
            }

        }
        return unique;

    }
}
