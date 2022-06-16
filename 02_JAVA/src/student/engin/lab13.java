package student.engin;





public class lab13 {
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    public static void main(String[] args) {
        String abc="aabbbcccc";
        frequency(abc);
    }

    public static void frequency(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (!(result.contains("" + str.charAt(i)))) {
                result += str.charAt(i) + " ==> " + count + " times repeated, \n";
            }

        }
        System.out.println(result);

    }

}

