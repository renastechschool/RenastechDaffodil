package student.Bunyamin;

public class lab_04 {
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {
        String sample = "AAABBBCCCDEF";
        String result = unique(sample);
        System.out.println("result = " + result);
    }

    public static String unique(String a) {
        String unique = "";
        for (int i = 0; i < a.length(); i++) {
            int count = 0;
            for (int z = 0; z < a.length(); z++) {
                String first = "" + a.charAt(i);
                String second = "" + a.charAt(z);
                if (first.equals(second)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += a.charAt(i);
            }

        }
        return unique;


    }
}
